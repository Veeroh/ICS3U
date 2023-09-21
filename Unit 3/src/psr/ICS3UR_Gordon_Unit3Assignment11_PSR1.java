/*ICS3UR_Gordon_Unit3Assignment11_PSR1.java
 * Plays rock, paper, scissors with the player and determines the winner with nested if else statements.
 * 10/6/20
 * Alex Gordon
 * ICS3UR
 */
package psr;																		//Package Declaration

import java.util.Scanner;															//Import Scanner and Math
import java.lang.Math;

public class ICS3UR_Gordon_Unit3Assignment11_PSR1									//Class Declaration
	{
	public static void main(String[] args) {										//Define main()
		final int ROCK = 1, PAPER = 2, SCISSORS = 3;								//Declare variables as int
		int playerThrow, computerThrow;
		Scanner input = new Scanner(System.in);
		
		System.out.print( "Enter your throw (1=Rock, 2 =Paper, 3 = Scissors): " );	//Input from user
		playerThrow = input.nextInt();
		input.close();

		computerThrow = (int)(3 * Math.random() + 1); 								//Random computerThrow
		
		System.out.print("Player throws ");
		switch(playerThrow)
		{
			case ROCK: System.out.println("ROCK.");
			break;
			case PAPER: System.out.println("PAPER.");
			break;
			case SCISSORS: System.out.println("SCISSORS.");
			break;
		}
		
		System.out.print( "Computer throws ");
		switch (computerThrow)
		{
			case ROCK: System.out.println( "ROCK." );
			break;
			case PAPER: System.out.println( "PAPER.");
			break;
			case SCISSORS: System.out.println( "SCISSORS.");
			break;
		}
		
		if(computerThrow == ROCK)									//Nested if else statement for computer throws rock
		{
			if(playerThrow == ROCK && computerThrow == ROCK)
			{
				System.out.println("It's a draw!");
			}
				else if(playerThrow == PAPER && computerThrow == ROCK)
				{
					System.out.println("Player wins!");
				}
					else
					{
						System.out.println("Computer wins!");
					}	
		}
		
		if (computerThrow == PAPER)									//Nested if else statement for computer throws paper
		{
			if(playerThrow == ROCK && computerThrow == PAPER)
			{
				System.out.println("Computer wins!");
			}
				else if(playerThrow == PAPER && computerThrow == PAPER)
				{
					System.out.println("It's a draw!");
				}
					else
					{	
						System.out.println("Player wins!");
					}
		}
		
		if (computerThrow == SCISSORS)								//Nested if else statement for computer throws scissors
		{
			if(playerThrow == ROCK && computerThrow == SCISSORS)
			{
				System.out.println("Player wins!");
			}
				else if(playerThrow == PAPER && computerThrow == SCISSORS)
				{
					System.out.println("Computer wins!");
				}
					else
						{	
							System.out.println("It's a draw!");
						}
		}
	}
}