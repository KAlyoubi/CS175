package ch5;

import java.util.Scanner;

public class E56 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner in = new Scanner(System.in);

		System.out.println("Strict or lenient? ");
        	String input = in.next().toLowerCase();
        
        
        	System.out.println("Please enter 3 integers: ");
        
        	int num1 = in.nextInt();
        
        	int num2 = in.nextInt();
        
        	int num3 = in.nextInt();

        
        	if (input.equals("strict")) {
            
        		if (num1 < num2 && num2 < num3) {
                System.out.println("increasing");
            }
            
        		else if (num1 > num2 && num2 > num3) {
                
        			System.out.println("decreasing");
            }
            
        		else {
                
        			System.out.println("neither");
            }
        }
        
        	else if (input.equals("lenient")) {
            
        		if ((num1 <= num2 && num2 < num3) || (num1 < num2 && num2 <= num3)) {
                
        			System.out.println("increasing");
            }
            
        		else if ((num1 >= num2 && num2 > num3) || (num1 > num2 && num2 >= num3)) {
                
        			System.out.println("decreasing");
            }
            
        		else if ((num1 == num2) && (num2 == num3)) {
                
        			System.out.println("increasing and decreasing");
            }
            else {
                
            	System.out.println("neither");
            }
        }

}//main

}//class
