package Small;

import java.util.Scanner;

public class Small {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten integers:");
		int [] array = new int[10];
		    for(int i=0 ; i<array.length;i++){
		      array[i]= input.nextInt();
		    }
		    int k=indexOfSmallElement(array);
		    System.out.println(k);
		    
		     }
		 
		public static int indexOfSmallElement(int[] array)
		{
		int k = 0;
		int index = array[0];
		for(int i=0;i<array.length-1;i++)
		{
		      if(index>array[i+1]) 
		      {
		      index= array[i+1];
		      k=k+i;
		      }
		      
		}
		return k;
		}
}
	



