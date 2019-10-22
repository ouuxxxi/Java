import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = 0;//余数
        while (a % b != 0) {//辗转相除法
            c = a % b;
            a = b;
            b = c;
        }
        System.out.print("最大公约数为：" + c);
        System.out.println();
    }
}
