
import java.util.Scanner;

public class GroceryDiscountV2 {

	public static void main(String[] args) {



		Scanner in = new Scanner(System.in);

		
		double eightPercent = 0.08;
		
		double tenPercent = 0.10;
		
		double twelvePercent = 0.12;
		
		double fourteenPercent = 0.14;
		

		System.out.println("Please enter cost of your groceries or 'E' to quit");

		while (in.hasNextDouble()){

			double costOfGroceries = in.nextDouble();

			if(costOfGroceries >= 10 && costOfGroceries <= 1000) {



				if (costOfGroceries == 0) {
				}

				else if (costOfGroceries < 10) {
					System.out.println("You are not eligible for a coupon this time");
				}
				
				else if (costOfGroceries <= 60) {
					System.out.println("You win a discount coupon of $" + (costOfGroceries * eightPercent) + " 8% of your purchase");
				}
				
				else if (costOfGroceries <= 150) {
					System.out.println("You win a discount coupon of $" + ( costOfGroceries* tenPercent) + " 10% of your purchase");
				}
				
				else if (costOfGroceries <= 210) {
					System.out.println("You win a discount coupon of $" + (costOfGroceries * twelvePercent) + " 12% of your purchase");
				}
				
				else if (costOfGroceries >= 210) {
					System.out.println("You win a discount coupon of $" + (costOfGroceries * fourteenPercent) + " 14% of your purchase");
				}

				System.out.println();
				System.out.println("Please enter cost of your groceries or '0' to quit");



			}else {System.out.println("Please enter a number between 10 and 1000!");
			}
		}




	}

}







