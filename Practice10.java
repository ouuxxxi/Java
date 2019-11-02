import java.util.Scanner;

//写一个函数返回参数二进制中 1 的个数 比如：15 : 0000 1111   4 个 1
public class Practice10 {
    public static int func(int n){
        int count=0;
        for(int i=0;i<32;i++){
          if(((n>>i)&1) == 1){
             count++;
          }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print("请输入二进制数：");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.print("1的个数为：");
        System.out.println(func(n));
    }
}
