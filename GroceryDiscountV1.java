
import java.util.Scanner;

public class GroceryDiscountV1 {

	public static void main(String[] args) {



		Scanner in = new Scanner(System.in);

		boolean decision = true;

		//double costOfGroceries;

		while (decision == true) {

		System.out.println("Please enter cost of your groceries or '0' to quit");
		double costOfGroceries = in.nextDouble();



		if (costOfGroceries == 0) {
			decision = false;
		}

		else if (costOfGroceries < 10) {
			System.out.println("You are not eligible for a coupon this time");
		}
		else if (costOfGroceries < 60) {
			System.out.println("You win a discount coupon of $" + (costOfGroceries * 0.08));
			}
		else if (costOfGroceries < 150) {
			System.out.println("You win a discount coupon of $" + ( costOfGroceries* 0.10));
		}
		else if (costOfGroceries < 210) {
			System.out.println("You win a discount coupon of $" + (costOfGroceries * 0.12));
		}
		else if (costOfGroceries > 210) {
			System.out.println("You win a discount coupon of $" + (costOfGroceries * 0.14));
			}



		}


	}

}







