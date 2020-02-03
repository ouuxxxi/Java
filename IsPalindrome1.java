//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写
public class IsPalindrome1 {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] a = s.toCharArray();
        int start = 0;
        int end = a.length - 1;

        //：可以直接用haracter.isLetterOrDigit（）判断hi是否为字母和数字
        while (start < end) {
            if (!Character.isLetterOrDigit(a[start])) {
                start++;//如果不是数字或者字母，指针向后移动一位
                continue;
            }
            if (!Character.isLetterOrDigit(a[end])) {
                end--;//如果不是数字或者字母j指针向前移动一位
                continue;
            }
            if (a[start] != a[end]) {
                return false;
            }
            //指针移动
            start++;
            end--;
        }
        return true;
    }






    public static void main(String[] args) {
        String s =  "race a car";
        boolean flag=isPalindrome(s);
        System.out.println(flag);
    }
}
