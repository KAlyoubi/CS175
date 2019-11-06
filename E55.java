package ch5;

import java.util.Scanner;

public class E55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		

		System.out.println("Enter 3 numbers");
		
		int num1 = in.nextInt();
		
		int num2 = in.nextInt();
		
		int num3 = in.nextInt();
		
		
		if (num1 < num2 && num2 < num3)
			System.out.println("The numbers are increasing");
		else if (num1 > num2 && num2 > num3)
			System.out.println("The numbers are decreasing");
		else 
			System.out.println("Neither");
		
	}//main

}//class
