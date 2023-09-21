/*ICS3UR_Gordon_Unit3Assignment11_PSR2.java
 * Plays rock, paper, scissors with the player and determines the winner with switch statements.
 * 10/6/20
 * Alex Gordon
 * ICS3UR
 */
package psr;													//Package declaration

import java.util.Scanner;										//Import scanner and math
import java.lang.Math;	

public class ICS3UR_Gordon_Unit3Assignment12_PSR2				//Class declaration
{
public static void main(String[] args)							//Define main()
	{
		final int ROCK = 1, PAPER = 2, SCISSORS = 3;			//Declare variables as int
		int playerThrow, computerThrow;
		Scanner input = new Scanner(System.in);

		System.out.print( "Enter your throw (1=Rock, 2 =Paper, 3 = Scissors): " );	//Input from user
		playerThrow = input.nextInt();
		input.close();
		computerThrow = (int)(3 * Math.random() + 1); 
		System.out.print("Player throws ");						//Player throws switch statement
		switch(playerThrow)
		
		{
			case ROCK: System.out.println("ROCK.");
			break;
			case PAPER: System.out.println("PAPER.");
			break;
			case SCISSORS: System.out.println("SCISSORS.");
			break;
		}
		
		System.out.print( "Computer throws ");					//Computer throws switch statement
		switch (computerThrow)
		
		{
			case ROCK: System.out.println( "ROCK." );
			break;
			case PAPER: System.out.println( "PAPER.");
			break;
			case SCISSORS: System.out.println( "SCISSORS.");
			break;
		}

		switch (computerThrow)									//Winner determining switch statement
		{
			case ROCK:
				if (playerThrow == ROCK)
					System.out.println("It's a draw!");
				if (playerThrow == PAPER)
					System.out.println("Player wins!");
				if (playerThrow == SCISSORS)
					System.out.println("Computer wins!");
				break;
			case PAPER:
				if (playerThrow == ROCK)
					System.out.println("Computer wins!");
				if (playerThrow == PAPER)
					System.out.println("It's a draw!");
				if (playerThrow == SCISSORS)
					System.out.println("Player wins!");
				break;
			case SCISSORS:
				if (playerThrow == ROCK)
					System.out.println("Player wins!");
				if (playerThrow == PAPER)
					System.out.println("Computer wins!");
				if (playerThrow == SCISSORS)
					System.out.println("It's a draw!");
				break;
		}
	}
}
