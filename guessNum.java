import java.util.Random;
import java.util.Scanner;

//猜数字[1,100]
public class guessNum {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100)+1;//产生随机数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要猜的数字:");

        while (true){
            int num = input.nextInt();
            if(num>n){
                System.out.println("你猜大了，请重新输入");
            }else if(num<n){
                System.out.println("你猜小了，请重新输入");
            }else{
                System.out.println("你猜对了，请重新输入");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}
