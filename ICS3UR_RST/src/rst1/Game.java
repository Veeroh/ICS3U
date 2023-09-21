/* Game.java
 * The primary code where the game happens.
 * Alex Gordon
 * 11/9/20
 * ICS3UR
 */
package rst1;										//Package declaration

import java.util.Scanner;							//Import utilities

public class Game {									//Class declaration
	
	private static Object cpuFirstCard = 0;			//Declare objects
	private static Object cpuSecondCard = 0;
	private static Object cpuThirdCard = 0;
	private static Object firstCard = 0;
	private static Object secondCard = 0;
	private static Object thirdCard = 0;
	private static Object firstCard_1 = 0;
	private static Object secondCard_1 = 0;
	private static Object thirdCard_1 = 0;	
	private static Object BlackJack = 21;
	private static int previousThirdCard = 0;		//Declare variables
	private static int thirdCardTotal = 0;
	private static int previousThirdCard_1 = 0;
	private static int thirdCardTotal_1 = 0;
	private static String player1 = "Player";					//Declare strings
	private static String player2 = "Computer";
	Card card = new Card();							//Declare Card.java
	Computer computer = new Computer();				//Declare Computer.java
	Scanner input = new Scanner(System.in);			//Declare scanner variable

	public void PlayerVsComputer() {				//PlayerVsComputer() method
		
		System.out.println("It's the Player's turn.");

		System.out.println("──────────────────────────────────────────");	//Deal the first 2 cards and display them
		firstCard = Card.cardDeal();
		secondCard = Card.cardDeal();
		System.out.println("\nThe first two cards you're given are " + firstCard + " and " + secondCard + ", which total to " + total(0) + ".");
		System.out.println("──────────────────────────────────────────");
		
		if (total(0) == BlackJack) {				//Determines if the total is 21, then player immediately wins
			System.out.println("\nBlackjack! Player wins!");
			System.exit(1);
		}
		
		while(total(0) != BlackJack) {				//While the total is anything but 21, continue to run while loop
			
		System.out.print("Would you like to hit or stand? (H for hit & S for stand): ");
		String hitorstand = input.nextLine();		//Request user to get another card
		
		if (hitorstand.equals("H")) {				//If user responds with H, run for statement
			for (int i = 0; i <= 3; i++) {			//For statement that allows the player to aquire 3 more cards (2+3=5 max)
				hit();								//Call hit() method
				System.out.print("Would you like to hit or stand Again? (H for hit & S for stand): ");
				hitorstand = input.nextLine();		//Request if user wants to aquire another card	
				if (hitorstand.equals("S")) {		//If user's response is S, break loop
					break;
				}
			continue;								//Continue loop
			}
		}
	
		if (total(0).equals(BlackJack)) {			//If total card value equals 21, player wins
			System.out.println("\nYou reached 21! Player wins!");
			System.exit(1);
		}
	
		System.out.println("\nComputer (Dealer)'s turn.");	//Computer's turn
		
		System.out.println("──────────────────────────────────────────");	//Deal the first 2 cards for the computer and display the result.
		cpuFirstCard = Card.cpuCardDeal();
		cpuSecondCard = Card.cpuCardDeal();
		System.out.println("\nThe first two cards given are " + cpuFirstCard + " and " + cpuSecondCard + ", which total to " + cputotal(0) + ".");
		System.out.println("──────────────────────────────────────────");
		Computer.delay1();
		
		System.out.println("Computer is determining to hit or stand...");	//Simulate computer determining to hit or stand
		Computer.delay3();
		int cpuDesicion = Computer.hitorstand();							//Call hitorstand() from Computer.java
		
		while (cpuDesicion == 1) {											//While computer's desicion is to hit
			System.out.println("\n──────────────────────────────────────────");
			cpuThirdCard = Card.cpuCardDeal();								//Call cpuCardDeal()
			System.out.println("Computer (Dealer)'s total comes to " + cputotal(0) + ".");
			System.out.println("──────────────────────────────────────────");	
			
			if (cputotal(0).equals(BlackJack)) {							//If computer's total equals 21, computer wins
				System.out.println("\nComputer reached 21! Computer wins!");
				System.exit(1);
			}
			
			int overLimit1_1 = (int)cputotal(0);							//Temporary int variables to compare an object and method's returned value
			int overLimit2_1 = (int)BlackJack;
			
			if (overLimit1_1 > overLimit2_1) {								//If computer went over 21, player wins
				System.out.println("Computer went over 21! You win!");
				System.exit(1);
			}
			
			System.out.println("Computer is determining to hit or stand...");	//Simulate computer's desicion 
			Computer.delay3();
			cpuDesicion = Computer.hitorstand();							//Call hitorstand() from Computer.java
			
			if (cpuDesicion == 0) {											//If computer's desicion is S, break loop
				break;
			}
			
		}
		
		if (cpuDesicion == 0) {												//Tell player that computer decides to stand.
			System.out.println("Computer decides to stand. \n");
		}	
		
		System.out.println("Player's turn.");
	}																		//Go back to start of loop if conditions are still total != 21
}
	
	public static void hit() {												//hit() method
		System.out.println("\n──────────────────────────────────────────");
		thirdCard = Card.cardDeal();										//Call cardDeal() from Card.java
		int total = (int)total(0);											//Total() value is assigned to new total variable
		System.out.println("Your total comes to " + total + ".");			//Display out
		System.out.println("──────────────────────────────────────────");	
			
		if (total == (int)BlackJack) {										//If the total is 21, player or player 1 wins
			System.out.println("\nYou reached 21! " + player1 + " wins!");
			System.exit(1);
		}
		
		int overLimit1 = total;												//Assign new temporary variables to total and blackjack
		int overLimit2 = (int)BlackJack;
		
		if (overLimit1 > overLimit2) {										//If total is greater that 21, computer or player 2 wins
			System.out.println("You went over 21! " + player2 + " wins!");
			System.exit(1);
		}
		overLimit1 = 0;														//Assign all temporary variables back to 0				
		overLimit2 = 0;
		total = 0;
		thirdCard = 0;
		thirdCardTotal = 0;
	}
	
	public static void hit2() {												//hit2() method identical to hit(), just the player's roles have switched
		System.out.println("\n──────────────────────────────────────────");
		thirdCard_1 = Card.cardDeal();
		int total_1 = (int)total2(0);
		System.out.println("Your total comes to " + total_1 + ".");
		System.out.println("──────────────────────────────────────────");	
			
		if (total_1 == (int)BlackJack) {
			System.out.println("\nYou reached 21! " + player2 + " wins!");	
			System.exit(1);
		}
		
		int overLimit1_1 = total_1;
		int overLimit2_1 = (int)BlackJack;
		
		if (overLimit1_1 > overLimit2_1) {
			System.out.println("You went over 21! " + player1 + "  wins!");
			System.exit(1);
		}
		overLimit1_1 = 0;
		overLimit2_1 = 0;
		total_1 = 0;
		thirdCard_1 = 0;
		thirdCardTotal_1 = 0;
	}
	
	public static Object total(int total) {									//total() method
		thirdCardTotal = previousThirdCard + (int)thirdCard;				//The cards other than the first and second are summed up
		previousThirdCard = (int)thirdCard;									//Third Card gets assigned this variable
		total = (int)firstCard + (int)secondCard + thirdCardTotal;			//Total is assigned all values combined
		return total;														//Return total
	}

	public static Object total2(int total_1) {								//total2() method identical to total(), used for second player
		thirdCardTotal_1 = previousThirdCard_1 + (int)thirdCard_1;
		previousThirdCard_1 = (int)thirdCard_1;
		total_1 = (int)firstCard_1 + (int)secondCard_1 + thirdCardTotal_1;
		return total_1;
	}
	
	public static Object cputotal(int total) {								//cpuTotal() method
		total = total + (int)cpuFirstCard + (int)cpuSecondCard + (int)cpuThirdCard;	//total value is assigned all values combined
		return total;														//Return total
	}

	public void PlayerVsPlayer() {											//PlayerVsPlayer() method
		
		System.out.print("What is Player 1's name?: ");						//Request players name (Default is P1: Player, P2: Computer)
		player1 = input.nextLine();
		System.out.print("What is Player 2's name?: ");
		player2 = input.nextLine();
		System.out.println("\nAlright, it is " + player1 + " vs. " + player2 + "!");
		
		System.out.println("\nIt's " + player1 + "'s turn.");				//Player1's turn first

		System.out.println("──────────────────────────────────────────");
		firstCard = Card.cardDeal();										//cardDeal is called from Card.java to assign first two cards
		secondCard = Card.cardDeal();
		System.out.println("\nThe first two cards you're given are " + firstCard + " and " + secondCard + ", which total to " + total(0) + ".");
		System.out.println("──────────────────────────────────────────");
	
		if (total(0) == BlackJack) {										//if total equals 21, player 1 immediately wins
			System.out.println("\nBlackjack! " + player1 + " wins!");
			System.exit(1);
		}
	
		while(total(0) != BlackJack) {										//While the total is anything but 21, run while loop
		
			System.out.print("Would you like to hit or stand? (H for hit & S for stand): ");
			String hitorstand = input.nextLine();
	
			if (hitorstand.equals("H")) {									//If input is H, run for loop
				for (int i = 0; i <= 3; i++) {								//For loop to give the user 3 more times to request a card
					hit();													//hit() method is called
					System.out.print("Would you like to hit or stand Again? (H for hit & S for stand): ");
					hitorstand = input.nextLine();							//Requests if hit or stand wants to be called again
					
					if (hitorstand.equals("S")) {							//If user inputs S, break loop
						break;
					}
				continue;													//Else continue the loop
				}
			}

			if (total(0).equals(BlackJack)) {								//If the total equals 21, player 1 wins
				System.out.println("\nYou reached 21! " + player1 + " wins!");
				System.exit(1);
			}
			
		System.out.println("\nIt's " + player2 + "'s turn.");				//Player 2's turn
		System.out.println("──────────────────────────────────────────");
		firstCard_1 = Card.cardDeal();										//cardDeal() is called to assign first two cards' value
		secondCard_1 = Card.cardDeal();
		System.out.println("\nThe first two cards you're given are " + firstCard_1 + " and " + secondCard_1 + ", which total to " + total2(0) + ".");
		System.out.println("──────────────────────────────────────────");
	
		if (total2(0) == BlackJack) {										//If total equals 21, player 2 immediately wins
			System.out.println("\nBlackjack! " + player2 + " wins!");
			System.exit(1);
		}
	
		while(total2(0) != BlackJack) {										//While the card's total is anything but 21, run while loop
		
			System.out.print("Would you like to hit or stand? (H for hit & S for stand): ");
			String hitorstand_1 = input.nextLine();							//Requests if user wants to get another card
	
			if (hitorstand_1.equals("H")) {									//If user inputs H, run for loop
				for (int i = 0; i <= 3; i++) {								//Gives 3 more times for user to get another card (2+3=5 max cards)
					hit2();
					System.out.print("Would you like to hit or stand Again? (H for hit & S for stand): ");
					hitorstand_1 = input.nextLine();						//Request if user wants another card
					
					if (hitorstand_1.equals("S")) {							//If user's input is S, break loop
						break;
					}
					
					continue;												//Else continue loop
				}
				
				if (total2(0).equals(BlackJack)) {							//If total equals 21, player 2 wins
					System.out.println("\nYou reached 21! " + player2 + " wins!");
					System.exit(1);
					}
				}										
			}
		}																	//Go back to start of while loop, player 1's turn.
	}
}