import java.util.Scanner;
public class Practice9 {
    public static void print(int n){
       if(n>9) {
           print(n /10);
       }
        System.out.println(n%10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        print(n);
    }
}
