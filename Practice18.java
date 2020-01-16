import java.util.Scanner;
//大写字母转换成小写字母
public class Practice18 {
    public static String toLowerCase(String str) {
     String str1=str.toLowerCase();
     return str1.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(toLowerCase(str));
    }
}
