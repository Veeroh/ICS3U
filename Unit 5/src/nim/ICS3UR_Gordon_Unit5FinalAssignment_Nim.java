/*ICS3UR_Gordon_Unit5FinalAssignment_Nim.java
 * Plays a game of nim with a computer
 * Alex Gordon 
 * 10/28/20
 * ICS3UR
 */
package nim;											//Package declaration

import java.util.Scanner;								//Import utlities
import java.util.Random;

public class ICS3UR_Gordon_Unit5FinalAssignment_Nim {	//Class declaration
	static Scanner input = new Scanner(System.in);		//Declare public input and random variables
	static Random rand = new Random();
	
	public static void main(String[] args) {			//main() method
		
		int stones = (int)(Math.random() * 15 + 30);	//Random stone value between 15 and 30
		int user = 0;									//Variables as int
		int computer = 0;
		int winner = 0;
		
		System.out.println("Welcome to the nim game!");
		System.out.println("We will be starting with " + stones + " stones.");
		
		while (stones > 0) {							//While stones are greater than 0, continue loop
			user = userInput(user);						//Calls userInput method
			stones = stones - user;						//Subtracts the user's input from the total amount of stones
			System.out.println("\nUser takes " + user + " stone(s).");

			if (stones < 0) {							//If stones are negative, tell user to retry
				System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("Invalid value! Stones are in the negatives! try again.");
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				stones = stones + user;
				user = 0;
				user = userInput(user);
			}
			
			if (stones == 0) {							//If the stones equal 0, break loop and call winner
				winner = 1;
				break;
			}
				
			computer = computerInput(computer);			//Calls computerInput method
			stones = stones - computer;					//Subracts the computer's input from the total stones
			System.out.println("Computer takes " + computer + " stone(s).");

			if (stones < 0) {							//If stones are negative, reject value and return to user draw
				System.out.println("\nComputer put an Invalid value!");
				stones = stones + computer;			
				computer = 0;
				computer = computerInput(computer);
			}
			
			if (stones == 0) {							//If stones equal 0, break loop and call winner
				winner = 0;
				break;
			}
			
			System.out.print("\nThere are " + stones + " stones left!\n");	//Total stones left

			user = 0;									//Reset value
			computer = 0;
		}	
		
		if (winner == 1) {								//If winner is 1, call user winner
			System.out.print("\nUser wins!");
		}
		
		else {
			System.out.print("\nComputer wins!");

		}
		
	}
		
	
	public static int userInput(int value1) {			//userInput method
		while (value1 == 0) {							//While value1 equals 0, loop
		System.out.print("\nHow many stones do you want to take?: ");
		value1 = input.nextInt();						//Get input from user
		
		value1 = isValidEntry(value1);					//Call isValidEntry to verify number
		}
		
		return value1;									//Return number
	}
	
	public static int isValidEntry(int value2) {		//isValidEntry
		
		while (value2 != 3 && value2 != 2 && value2 != 1)	//while value is not between 1-3, loop
		{
			System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("You have to put a value between 1 & 3! Try again.");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.print("\nHow many stones do you want to take?: ");

			value2 = input.nextInt();					//Get input from user
		}
		 
		return (value2);								//Return value to userInput
	}
	
	public static int computerInput(int computerValue) {	//computerInput
		
        return (int)(Math.random() * 3 + 1);			//Return random value between 1-3
	}
}
