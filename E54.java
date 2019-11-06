package ch5;

import java.util.Scanner;

public class E54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("write a number");
		double num1 = in.nextDouble();
		
		System.out.println("write another number");
		double num2 = in.nextDouble();
		
		System.out.println("write the last number");
		double num3 = in.nextDouble();
		
		
		if (num1 == num2 && num1 == num3)
			System.out.println("all the same");
		
		else if (num1 != num2 && num2 != num3 && num1!= num3)
			System.out.println("all different");
		
		else
			System.out.println("neither");
		

	}//main

}//class
