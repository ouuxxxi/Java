
import java.io.BufferedReader;
 import java.io.IOException;
import java.io.InputStreamReader;
public class Practice24 {

 public static void main(String args[]) throws NumberFormatException, IOException{
             BufferedReader strin = new BufferedReader(new
                    InputStreamReader(System.in));
             long i = Integer.parseInt(strin.readLine());
            long sum = (1+i)*i/2;
             System.out.println(sum);
            }
 }

