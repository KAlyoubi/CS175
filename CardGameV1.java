package CardGameProject;

import java.util.Random;

import java.util.Arrays;

public class CardGameV1 {

	public static void main(String[] args) {

		Random generator = new Random();

		int countD = 0, countH = 0, countS = 0, countC = 0, countDraw = 0, myDraw = 0, yourDraw = 0, myLowRange = 0, myHighRange = 0, yourLowRange = 0, yourHighRange = 0, count1 = 0, count2 = 0;
		String MySuit = null;
		
		int[] MyHand = new int[5];

		String YourSuit = null;
		
		int[] YourHand = new int[5];
		
		boolean Winner = false;

		//assigns card values to both hands and determines suit
		for (int i = 0; i < MyHand.length; i++) {
			
			MyHand[i] = generator.nextInt(52) + 1;
			
			if (MyHand[i] >= 1 && MyHand[i] <= 13) {
				countH++;
			}
			else if (MyHand[i] >= 14 && MyHand[i] <= 26) {
				countD++;
			}
			else if (MyHand[i] >= 27 && MyHand[i] <= 39) {
				countC++;
			}
			else if (MyHand[i] >= 40 && MyHand[i] <= 52) {
				countS++;
			}
			if (countH >= countS && countH >= countD && countH >= countC) {
				MySuit = "Hearts";
				myLowRange = 1;
				myHighRange = 13;
			}
			else if (countD >= countH && countD >= countC && countD >= countS) {
				MySuit = "Diamonds";
				myLowRange = 14;
				myHighRange = 26;
			}
			else if (countC >= countH && countC >= countD && countC >= countS) {
				MySuit = "Clubs";
				myLowRange = 27;
				myHighRange = 39;
			}
			else if (countS >= countH && countS >= countC && countS >= countD) {
				MySuit = "Spades";
				myLowRange = 40;
				myHighRange = 52;
			}
		}
		countD = 0;
		
		countH = 0;
		
		countS = 0;
		
		countC = 0;
		
		for (int i = 0; i < YourHand.length; i++) {
			YourHand[i] = generator.nextInt(52) + 1;
			if (YourHand[i] >= 1 && YourHand[i] <= 13) {
				countH++;
			}
			else if (YourHand[i] >= 14 && YourHand[i] <= 26) {
				countD++;
			}
			else if (YourHand[i] >= 27 && YourHand[i] <= 39) {
				countC++;
			}
			else if (YourHand[i] >= 40 && YourHand[i] <= 52) {
				countS++;
			}
			if (countH >= countD && countH >= countC && countH >= countS) {
				YourSuit = "Hearts";
				yourLowRange = 1;
				yourHighRange = 13;
			}
			else if (countD >= countH && countD >= countC && countD >= countS) {
				YourSuit = "Diamonds";
				yourLowRange = 14;
				yourHighRange = 26;
			}
			else if (countC >= countH && countC >= countD && countC >= countS) {
				YourSuit = "Clubs";
				yourLowRange = 27;
				yourHighRange = 39;
			}
			else if (countS >= countH && countS >= countC && countS >= countD) {
				YourSuit = "Spades";
				yourLowRange = 40;
				yourHighRange = 52;
			}
		}
		System.out.println("My hand has five cards: " + Arrays.toString(MyHand));
		
		System.out.println("Your hand has five cards: " + Arrays.toString(YourHand));
		
		System.out.println("My suit is " + MySuit + ".");
		
		System.out.println("Your suit is " + YourSuit + ".");

		while (!Winner) {
			countDraw++;
			myDraw = generator.nextInt(52) + 1;
			System.out.println("My draw " + countDraw + ": " + myDraw);
			yourDraw = generator.nextInt(52) + 1;
			System.out.println("Your draw " + countDraw + ": " + yourDraw);
			if (myDraw >= myLowRange && myDraw <= myHighRange) {
				for (int i = 0; i < MyHand.length; i++) {
					if (MyHand[i] < myLowRange || MyHand[i] > myHighRange) {
						MyHand[i] = myDraw;
						break;
					}//second if
				}//for
			}//first if
			count1 = 0;
			for (int j=0; j<5;j++) {
				if (MyHand[j] >= myLowRange && MyHand[j] <= myHighRange) {
					count1++;
				}
			}
			System.out.println("\tMy new hand is " + Arrays.toString(MyHand));
			if (count1 == 5 ) {
				Winner = true;
				System.out.println("I am the winner.");
				break;
			}
			if (yourDraw >= yourLowRange && yourDraw <= yourHighRange) {
				for (int i = 0; i < YourHand.length; i++) {
					if (YourHand[i] < yourLowRange || YourHand[i] > yourHighRange) {
						YourHand[i] = yourDraw;
						break;
					}
				}
			}
			count2 = 0;
			for (int j=0; j<5; j++) {
				if (YourHand[j] >= yourLowRange && YourHand[j]<= yourHighRange){
					count2++;
				}
			}
			System.out.println("\tYour new hand is " + Arrays.toString(YourHand));
			if (count2 == 5) {
				Winner = true;
				System.out.println("You are the winner.");
				break;
			}

		}
		System.out.println("The game is over.");
		

		
	}

}