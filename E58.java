package ch5;

import java.util.Scanner;

public class E58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter 4 numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();

        if ((num1 == num2 && num3 == num4) ||
        		
            (num1 == num3 && num2 == num4) ||
            
            (num1 == num4 && num2 == num3)) {

            System.out.println("Two pairs");
        }
        
        else {
            System.out.println("Not two pairs");
        }
        

       
    }

}