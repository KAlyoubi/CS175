import java.util.Scanner;

public class PaintCost {

	private static final int houseLengthInch = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//double houseLengthFeet;
		
		//double houseLengthInch;
		
		//double houseWidthFeet;
		
		//double houseWidthInch;
		
		//double houseHeightFeet;
		
		//double houseHeightInch;
		
		//double windowLenghtFeet;
		
		//double windowLenghtInch;
		
		//double windowWidthFeet;
		
		//double windowWidthInch;
		
		//int windowNumber;
		
		//double doorLenghtFeet;
		
		//double doorLenghtInch;
		
		//double doorWidthFeet;
		
		//double doorWidthInch;
		
		//int doorNumber;
		
		//double sqFtCost;
		
		//double sqFtNormal;
		
		//double sqFtWindows;
		
		//double sqFtDoors;
		
		Scanner in = new Scanner(System.in);
				
				System.out.println("Enter Length of the House in feet ");
				double houseLengthFeet = in.nextDouble();
				
				System.out.println("Enter remaining Length of the House in inch ");
				double houseLengthInch = in.nextDouble();
				houseLengthFeet = houseLengthFeet + houseLengthInch/12;

				System.out.println("Enter Width of the House in feet ");
				double houseWidthFeet = in.nextDouble();
				
				System.out.println("Enter remaining Width of the House in inch ");
				double houseWidthInch = in.nextDouble();
				houseWidthFeet = houseWidthFeet + houseWidthInch/12;

				System.out.println("Enter Height of the House in feet ");
				double houseHeightFeet = in.nextDouble();
				
				System.out.println("Enter remaining Height of the House in inch ");
				double houseHeightInch = in.nextDouble();
				houseHeightFeet = houseHeightFeet + houseHeightInch/12;
				
				System.out.println("Enter Length of the Window in feet ");
				double windowLenghtFeet = in.nextDouble();
				
				System.out.println("Enter remaining Length of the Window in inch ");
				double windowLenghtInch = in.nextDouble();
				windowLenghtFeet = windowLenghtFeet + windowLenghtInch/12;
				
				System.out.println("Enter Width of the Window in feet ");
				double windowWidthFeet = in.nextDouble();
				
				System.out.println("Enter remaining Width of the Window in inch ");
				double windowWidthInch = in.nextDouble();
				windowWidthFeet = windowWidthFeet + windowWidthInch/12;
				
				System.out.println("Enter number of Window ");
				int windowNumber = in.nextInt();
				
				System.out.println("Enter Length of the Door in feet ");
				double doorLenghtFeet = in.nextDouble();
				
				System.out.println("Enter remaining Length of the Door in inch ");
				double doorLenghtInch = in.nextDouble();
				doorLenghtFeet= doorLenghtFeet + doorLenghtInch/12;
				
				System.out.println("Enter Width of the Door in feet ");
				double doorWidthFeet = in.nextDouble();
				
				System.out.println("Enter remaining Width of the Door in inch ");
				double doorWidthInch = in.nextDouble();
				doorWidthFeet = doorWidthFeet + doorWidthInch/12;
				
				System.out.println("Enter number of Door ");
				int doorNumber = in.nextInt();
				
				System.out.println("Enter number of Cost per square foot ");
				double sqFtCost = in.nextDouble();
				
				//System.out.println("Enter number of Windows per square foot ");
				//double sqFtWindows = in.nextDouble();
				
				//System.out.println("Enter number of Doors per square foot ");
				//double sqFtDoors = in.nextDouble();
				
				//System.out.println("Enter number of Normal side per square foot ");
				//double sqFtNormal = in.nextDouble();
				
				double sqFtToPaint =(2 *(houseLengthFeet * houseWidthFeet) + 2 *(houseLengthFeet * houseWidthFeet + 0.5 * (houseLengthFeet * (houseHeightFeet-houseWidthFeet)))) - (windowNumber * windowLenghtFeet * windowWidthFeet) + (doorNumber * doorLenghtFeet * doorWidthFeet);
				 
				 //System.out.println(costOfPainting);
				 double costToPaint = (sqFtToPaint * sqFtCost);
				 System.out.println(costToPaint);
				 
				 


	}
	

}
