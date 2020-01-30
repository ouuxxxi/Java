//仅仅反转字母
public class reverseOnlyLetters {
    public static String reverseOnlyLetters(String S) {
        char[] num = S.toCharArray();
        int left = 0;
        int right = num.length - 1;
        while (left < right) {
            while (left < right && !isLetter(num[left])){
              left++;
            }
            while (left < right && !isLetter(num[right])){
                right--;
            }

                char temp;
            temp = num[left];
            num[left] = num[right];
            num[right] = temp;
            left++;
            right--;

        }
        return new String(num);//新的对象
        //return String.copyValueOf(value);数组拷贝过来
    }
    public static boolean isLetter(char a){
        if(a>='A' && a<='Z'|| a>='a' && a<='z'){
            return true;
        }
        return false;
}
    public static void main(String[] args) {
        String S= "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(S));
    }
}
