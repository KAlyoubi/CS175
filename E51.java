package ch5;

import java.util.Scanner;

public class E51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		
		String negZeroPos = "";
		
		int x = in.nextInt();
		
		if (x < 0)
			negZeroPos = "negative number";
		else if (x == 0)
			negZeroPos = "zero number";
		else
			negZeroPos = "positive number";
		
		System.out.println(x + " is a " + negZeroPos);

	}//main

}//class
