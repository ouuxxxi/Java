import java.util.Scanner;

//判断回文数
public class isPalindrome {

    public static boolean isPalindrome(int x) {
        int a = x;
        if(x<0){
            return  false;
        }
        if(x<10){
            return true; //0~9
        }
        if(x%10==0){ // 10 20 250 100 1000等
            return false;
        }
        int t=0;
        while (x>0){
            t=10*t+x%10; //11 121 1001 等
            x=x/10;
        }
        return a==t;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        boolean flag = isPalindrome(x);
        System.out.println(flag);
    }
}
