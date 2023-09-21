/* Card.java
 * Deals the card to the player or computer
 * Alex Gordon
 * 11/9/20
 * ICS3UR
 */
package rst1;													//Package Declaration

import java.util.Scanner;										//Import utlities
import java.util.Random;

public class Card {

static Random rand = new Random();								//new static Random variable

	public static int cardDeal() {								//cardDeal() method
		Scanner input = new Scanner(System.in);					//Scanner variable declaration
		int cardTemp = rand.nextInt(13) + 1;					//Random card from 1 to 13
		System.out.print("Picking a card out of deck... ");
		
		if (cardTemp == 1) {									//If card value = 1, allow user to choose value
			System.out.print("Your card is an Ace, which can be either 1 or 11. Which do you choose?: ");
			int userInput1 = input.nextInt();
			
			if (userInput1 == 1) {								//Set 1
				System.out.println("You choose a 1.");
				return(cardTemp);
			}
			if (userInput1 == 11 || userInput1 == 2) {			//Set 11
				System.out.println("You choose an 11.");
				cardTemp = 11;
				return(cardTemp);
			}
			if (userInput1 != 1 && userInput1 != 11); {			//Invalid value
				System.out.println("Error - Invalid Value! Restart Game.");
				System.exit(1);
			}
		}

		if (cardTemp >= 2 && cardTemp <= 10) {					//Tell user card if within 2 and 10
			System.out.println("Your card is " + cardTemp + ".");
		}
		
		if (cardTemp == 11) {									//If card is 11, reassign to 10
			System.out.println("Your card is a Jack, which is a 10.");
			cardTemp = 10;
		}
		
		if (cardTemp == 12) {									//If card is 12, reassign to 10
			System.out.println("Your card is a Queen, which is a 10.");
			cardTemp = 10;
		}
		
		if (cardTemp == 13) {									//If card is 13, reassign to 10
			System.out.println("Your card is a King, which is a 10.");
			cardTemp = 10;
		}
		
		if (cardTemp >= 14 || cardTemp <= 0) {					//Out of range card value (Used for testing)
			System.out.println("Error - cardTemp out of \"If statement\" range.");
			System.exit(1);
		}
		return cardTemp;										//Return card value
	}
	
	public static int cpuCardDeal() {							//cpuCardDeal() method
		System.out.print("Picking a card out of deck... ");
		int cardTemp = rand.nextInt(10) + 1;					//Random value between 1 and 10
		System.out.println("Computer's card is " + cardTemp);
		return cardTemp;										//Return card variable
	}

}
