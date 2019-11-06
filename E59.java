package ch5;

import java.util.Scanner;

public class E59 {

	public static void main(String []args) {
		// TODO Auto-generated method stub

		Scanner in= new Scanner(System.in); 


		double angle;

		System.out.println("Please enter an angle");

		angle=in.nextDouble();

		if (angle>0 && angle<=22.5) {

			System.out.println("You are heading NORTH");
}

		else if(angle>22.5 && angle<67.5) {

			System.out.println("You are heading NORTH-EAST ");
}

		else if(angle>=67.5 && angle<=112.5) {
	
			System.out.println("You are heading EAST ");
}

		else if(angle>112.5 && angle<157.5) {
	
			System.out.println("You are heading SOUTH-EAST ");
}

		else if(angle>=157.5 && angle<=202.5) {
	
			System.out.println("You are heading SOUTH");
}
	
		else if(angle>202.5 && angle<247.5) {
	
			System.out.println("You are heading SOUTH-WEST");
}

		else if(angle>=247.5 && angle<=292.5) {
	
			System.out.println("You are heading WEST");
}
		else if(angle>292.5 && angle<337.5) {
	
			System.out.println("You are heading NORTH-WEST");
}

		else if(angle>=337.5 && angle<=360.5) {
	
			System.out.println("You are heading NORTH");
}
	
		else {
			System.out.println("Are you lost?");
}
}

}
