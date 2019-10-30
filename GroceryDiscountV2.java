
import java.util.Scanner;

public class GroceryDiscountV2 {

	public static void main(String[] args) {



		Scanner in = new Scanner(System.in);

		boolean decision = true;

		//double costOfGroceries;

		//while (decision == true) {

		System.out.println("Please enter cost of your groceries or '0' to quit");
		
		while (in.hasNextDouble()){
		
			double costOfGroceries = in.nextDouble();
			
			if(costOfGroceries >= 10 && costOfGroceries <= 1000) {



		if (costOfGroceries == 0) {
			decision = false;
		}

		else if (costOfGroceries < 10) {
			System.out.println("You are not eligible for a coupon this time");
		}
		else if (costOfGroceries < 60) {
			System.out.println("You win a discount coupon of $" + (costOfGroceries * 0.08) + " 8% of your purchase");
			}
		else if (costOfGroceries < 150) {
			System.out.println("You win a discount coupon of $" + ( costOfGroceries* 0.10) + " 10% of your purchase");
		}
		else if (costOfGroceries < 210) {
			System.out.println("You win a discount coupon of $" + (costOfGroceries * 0.12) + " 12% of your purchase");
		}
		else if (costOfGroceries >= 210) {
			System.out.println("You win a discount coupon of $" + (costOfGroceries * 0.14) + " 14% of your purchase");
			}
		
		System.out.println();
		System.out.println("Please enter cost of your groceries or '0' to quit");
		
		
		
			}else {System.out.println("Please enter a number between 10 and 1000!");
			}
			}


		//}


	}

}







