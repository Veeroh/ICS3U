/*ICS3UR_Gordon_Unit4Assignment9_Wordguess.java
 * Plays a word guess game with the user and determines score from mistakes.
 * Alex Gordon
 * 10/12/20
 * ICS3UR
 */
package wordguess;

import java.util.Scanner;

public class ICS3UR_Gordon_Unit4Assignment9_WordGuess {
 
public static void main(String[] arqs) {
	
	final String SECRET_WORD = "BRAIN";
	final String FLAG = "!";
	String wordSoFar = "", updatedWord = "";
	String letterGuess, wordGuess = "";
	int	numGuesses = 0;
	String repeat = "";

	Scanner input = new Scanner(System.in);

	/* begin game */
	System. out. println ( "Word Guess game. \n" );

	do	
	{
		numGuesses = 0;
		wordSoFar = "";
		updatedWord = "";

		for (int i = 0; i < SECRET_WORD.length() ; i++) 
			{
				wordSoFar += "-"; //word, as dashes
			}	
		System.out.println("Your word is  ");
		System.out.println(wordSoFar + "\n"); //displays dashes
		/* a11ow player to make guesses */

	do
	{
		System.out.print("Enter a letter (" + FLAG + " to guess entire word): ");
		letterGuess = input.nextLine();
		letterGuess = letterGuess.toUpperCase() ;
		/* increment number of guesses */
		//numGuesses += 1;
		/* player correctly guessed a letter--excract string in wordSoFar
		 * up to the letter guessed and then append guessed. letter to that
		 * string Next, extract rest of wordSoFar and append after the guessed
		 * letter
		 */

		if (SECRET_WORD.indexOf(letterGuess) >= 0) 
		{
			updatedWord = wordSoFar.substring(0, SECRET_WORD.indexOf(letterGuess));
			updatedWord += letterGuess;
			updatedWord += wordSoFar.substring(SECRET_WORD.indexOf(letterGuess)+1,
			wordSoFar. length() ) ;
			wordSoFar = updatedWord;
		}
		
		else 
		{
			numGuesses += 1;
		}

		/* display guessed letter instead of dash */
		System.out.println(wordSoFar + "\n");
	} 
		
	while (!letterGuess.equals(FLAG) && !wordSoFar.equals(SECRET_WORD) && numGuesses < 6);
	/* finish game anil display message anil number of guesses */
	
	if (letterGuess.equals(FLAG)) 
	{
		System.out.println("What is your guess? ");
		wordGuess = input.nextLine() ;
		wordGuess = wordGuess.toUpperCase() ;
	}
	
	int score;								//Declare score as int
	score = 100 - (numGuesses * 10);		//Score loses 10 per mistake
	
	if (score < 0)
	{
		System.out.println("You lose!");
		score = 0;
	}
	
	else if (score > 0)
	{
		if (wordGuess.equals(SECRET_WORD) || wordSoFar.equals(SECRET_WORD)) 
		{
			System.out.println ( "You won!" ) ;
		} 
	
		else 
		{
			System.out.println("Sorry. You 1ose.");
		}
	}
	

	System.out.println("The secret word is " + SECRET_WORD);
	System.out.println("You made " + numGuesses + " mistake(s).");
	System.out.println("Your score is " + score + " points.");	//Display score

    System.out.println("Would you like to play again?");
    repeat = input.next();

	}
	
	while(repeat.equalsIgnoreCase("Y"));

	System.out.println("GOOD BYE THANKS FOR PLAYING!");
	}

}//end of Word Guess class