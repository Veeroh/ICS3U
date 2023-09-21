/* ICS3UR_Gordon_Unit3Assignment2_Surfsup2.java
Tells the user if it's a great day for surfing, bodyboarding or swimming.
Alex Gordon
9/28/20
ICS3UR
 */

package surfsup;													//Package declaration

import java.util.Scanner;											//Import scanner (input)

public class ICS3UR_Gordon_Unit3Assignment5_Surfsup3 {				//Class declaration

	public static void main(String[] args) {						//Define main()
		
		int wave = 0;												//Declare wave variable as int
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hey! How high are the waves?: ");			//Requests user input
		wave = input.nextInt();
		
		
		if (wave >= 6)
		{
			System.out.print("\n\nGreat day for surfing!");			//If the wave value were to be greater than 6
		}
		
		if (wave < 6 && wave >= 3)									//If the wave value were to be 3-6
		{
			System.out.print("\n\nGo body boarding!");
		}
		
		if (wave < 3 && wave >= 0)									//If the wave value were to be 0-3
		{
			System.out.print("\n\nGo for a swim.");				
		}
		
		else if (wave < 0)
		{
			System.out.print("\n\nWhoa! What kind of surf is that?"); //Else the wave value is negative
		}
	}
	
}
