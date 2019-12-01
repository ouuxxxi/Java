//给定一个字符类型的数组，用K把数组分成左半区和右半区
//例如：abcdefg 3  :   defgabc
import java.util.Scanner;

public class PractiseS2 {

        public static String reverse (String str,int left,int right ){
            char[] value = str.toCharArray();
            while (left < right) {
                char temp=value[left];
                value[left]=value[right];
                value[right]=temp;
                left--;
                right++;
            }
            return String.copyValueOf(value);
        }
        //翻转
        public static  String func(String str,int k){
            if(str==null || k<=0){
                return null;
            }
            str=reverse(str,0,k-1);
            str= reverse(str,k,str.length()-1);
            str=reverse(str,0,str.length()-1);
            return str;
        }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int k =input.nextInt();
        String str=input.next();//如果前面出现了nextInt 这里就不能用nextLine()
        String ret=func(str,k);
        System.out.println(ret);
    }
}

