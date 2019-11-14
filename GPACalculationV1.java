import java.util.Scanner;

public class GPACalculationV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		double gradeNumber = 0;
		System.out.println("Enter a letter grade or Q to quit the program: ");

		
		while (scan.hasNext()) {
			
			
			String letter = scan.next();
			
			if (letter.contentEquals("Q"))
				break;
			
			if (letter.equals("A+") || letter.equals("A")) {
				gradeNumber = 4.0;
				System.out.println("Your grade is " + gradeNumber);
			}
			
			else if (letter.contentEquals("A-")) {
				gradeNumber = 3.7;
				System.out.println("Your grade is " + gradeNumber);
			}
			
			else if (letter.contentEquals("B+")) {
				gradeNumber = 3.3;
				System.out.println("Your grade is " + gradeNumber);
				
			}
			else if (letter.contentEquals("B")) {
				gradeNumber = 3.0;
				System.out.println("Your grade is " + gradeNumber);
			}
			else if (letter.contentEquals("B-")) {
				gradeNumber = 2.7;
				System.out.println("Your grade is " + gradeNumber);

			}
			else if (letter.contentEquals("C+")) {
				gradeNumber = 2.3;
				System.out.println("Your grade is " + gradeNumber);

			}
			else if (letter.contentEquals("C")) {
				gradeNumber = 2.0;
				System.out.println("Your grade is " + gradeNumber);

			}
			else if (letter.contentEquals("C-")) {
				gradeNumber = 1.7;
				System.out.println("Your grade is " + gradeNumber);

			}
			else if (letter.contentEquals("D")) {
				gradeNumber = 1.0;
				System.out.println("Your grade is " + gradeNumber);

			}
			else if (letter.contentEquals("F")) {
				gradeNumber = 0;
				System.out.println("Your grade is " + gradeNumber);

			}
			else {
				System.out.println("Invalid letter grade!");
			}
			
			System.out.println();
			
			System.out.println("Enter a letter grade or Q to quit the program: ");


			
				
		}//while loop
		


	}//main

}//class
