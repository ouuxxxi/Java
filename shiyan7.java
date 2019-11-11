package O;
import java.util.Scanner;
public class O {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
           boolean Stop =true;
		      do{

		         try {
		                System.out.println("Input an integer in of the range of (-2147483647~2147483647)");
		                Scanner input = new Scanner(System.in);
		                int len = input.nextInt();
		                int largArray[] = new int[len];
		                Stop = false;

		            } catch (OutOfMemoryError e) {
		              System.out.println("OutOfMemoryError !");
		            }   
		        }while(Stop);
		            }

		       }
