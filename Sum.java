package Sum;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[][]array = new double[4][4];
		Scanner in = null;
		for(int i=0;i<=4;i++)
			for(int j = 0; j<=4;j++)
			    array[i][j]=in.nextDouble();
			System.out.print("Enter a 4-by-4 matrix row by row");
		    System.out.print(sumMajorDiagonal(array));
	}
	
	public static double sumMajorDiagonal(double[][]m) {
		double sum=0;
		for(int i=0;i<=m.length;i++)
		for(int j = 0; j<=m.length;j++)
	      if(i==j)sum+=m[i][j];
	  return sum;
	}

}
		
		


