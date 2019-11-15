import java.util.Scanner;

public class GPACalculationV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		double Grade = 0.0;
		double GPA = 0.0;
		double Gradepoints = 0.0;
		double Totalgrade = 0.0;

		
		int Totalcredit = 0;
		
		int Credit = 0;
		
		String Courselist = null;

		String Courseinfo = null;


		System.out.println("Enter the course info exactly like so: (Title,Credit hours,Letter grade (grade can be followed by + or -), or enter Q to quit: ");


		while(in.hasNext()) {

 
			Courseinfo = in.next();
 
 
			if(Courseinfo.equals("Q")) {
  
				break;
 }
 
			String [] data = Courseinfo.split(",");
 
			String info = data[0];
 
			int hours = Integer.parseInt(data[1]);
 
			String grade = data[2];
 
 
			Credit = hours;
 
			Courselist = info;
 
			Totalcredit += hours;
 

			System.out.println("Course: " + Courselist);
 
			System.out.println("Credits: " + Credit + " (" + Totalcredit + " total)");
 
 

 
			if (grade.equals("A") || grade.equals("A+")) {
  
				Grade = 4.0;
  
				Totalgrade += Grade;
  
				System.out.println("Numeric value: " + Grade + " (" + Totalgrade + " total)");
 }

			else if (grade.equals("A-")) {
  
				Grade = 3.7;
  
				Totalgrade += Grade;
  
				System.out.println("Numeric value: " + Grade + " (" + Totalgrade + " total)");
 }
 
			else if (grade.equals("B+")) {
 
				Grade = 3.3;
  
				Totalgrade += Grade;
  
				System.out.println("Numeric value: " + Grade + " (" + Totalgrade + " total)");
 }
 
			else if (grade.equals("B")) {
 
				Grade = 3.0;
 
				Totalgrade += Grade;
 
				System.out.println("Numeric value: " + Grade + " (" + Totalgrade + " total)");
 }
 
			else if (grade.equals("B-")) {
  
				Grade = 2.7;
  
				Totalgrade += Grade;
 
				System.out.println("Numeric value: " + Grade + " (" + Totalgrade + " total)");
 }
 
			else if (grade.equals("C+")) {
  
				Grade = 2.3;
  
				Totalgrade += Grade;
  
				System.out.println("Numeric value: " + Grade + " (" + Totalgrade + " total)");
 }
 
			else if (grade.equals("C")) {
  
				Grade = 2.0;
  
				Totalgrade += Grade;
 
				System.out.println("Numeric value: " + Grade + " (" + Totalgrade + " total)");
 }
 
			else if (grade.equals("C-")) {
 
				Grade = 1.7;
 
				Totalgrade += Grade;
  
				System.out.println("Numeric value: " + Grade + " (" + Totalgrade + " total)");
 }

			else if (grade.equals("D+")) {
  
				Grade = 1.3;
  
				Totalgrade += Grade;
 
				System.out.println("Numeric value: " + Grade + " (" + Totalgrade + " total)");
 }
 
			else if (grade.equals("D")) {
 
				Grade = 1.0;
 
				Totalgrade += Grade;
 
				System.out.println("Numeric value: " + Grade + " (" + Totalgrade + " total)");
 }
 
			else if (grade.equals("D-")) {
  
				Grade = 0.7;
 
				Totalgrade += Grade;
 
				System.out.println("Numeric value: " + Grade + " (" + Totalgrade + " total)");
 }
 
			else if (grade.equals("F") || grade.equals("WF")) {
				
				Grade = 0.0;
				
				Totalgrade += Grade;

				System.out.println("Numeric value: " + Grade + " (" + Totalgrade + " total)");

				
		  
 }
}

}
}
