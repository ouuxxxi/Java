//逆置字符串
public class PracticeS {
    public static  String reverse(String str){
        char[] value=str.toCharArray();
        int left=0;
        int right=value.length-1;
        while(left<right){
         char temp;
         temp=value[left];
         value[left]=value[right];
         value[right]=temp;
         left++;
         right--;
        }

        return String.copyValueOf(value);//数组拷贝过来
        //return new String(valuse);//新的对象
    }
    public static void main(String[] args) {
        String str="abcdef";
        System.out.println(reverse(str));
    }
}
