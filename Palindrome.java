package Palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enrter a three-digit integer:");
		int number = input.nextInt();
		if(number/100 == number%10)
			System.out.println(number + "is a palindrome");
		else
			System.out.println(number + "is not a palindrome");
		
		
		

	}

}
