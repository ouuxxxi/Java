package FindMin;

import java.util.Scanner;

public class FindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter ten numbers:");
		double array[] = new double[10];
		
		
		for(int i = 0;i<array.length;i++) {
			array[i]=input.nextDouble();}
			System.out. print("The minimum is:");
			System.out. print(min(array));
	}
	
	public static double min(double[] array) {
		double min= (double) array[0];
		for(int i= 1;i<array.length;i++){
		if(array[i]<min) min= array [i];
		}
     return min;
	}
}
