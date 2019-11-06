package ch5;

import java.util.Scanner;

public class E510 {

	public static void main(String[] args){
		// TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the employee name: ");
        String employeeName = in.next();

        System.out.print("Enter the hourly wage: ");
        double hourlyWage = in.nextDouble();

        System.out.print("Enter the number of hours worked last week: ");
        double hours = in.nextDouble();


        double salary = 0;
        
        if (hours <= 40) {
        
            salary = hours * hourlyWage;
        }
        else if (hours > 40) {
        
            salary = (40 * hourlyWage) + ((hours - 40) * hourlyWage * 1.5);
        }
       
        System.out.println(employeeName + "'s paycheck amounts to " + salary);
        
        

    }

}
