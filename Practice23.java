//给定圆的半径 r，求圆的面积
import java.util.Scanner;
public class Practice23 {
        private static final double PI = 3.14159265358979323;
       public static void main(String[] args) {
         int r = new Scanner(System.in).nextInt();
        if(1 <= r && r <= 10000) {
             double circular = PI*r*r;
            String result = String.format("%.7f", circular);
            System.out.println(result);
             }
         }
}
