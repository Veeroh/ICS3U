/* ICS3UR_Gordon_Unit3Assignment1_Surfsup1.java
Tells the user if it's a great day for surfing
Alex Gordon
9/28/20
ICS3UR
 */

package surfsup;													//Package declaration

import java.util.Scanner;											//Import scanner (input)

public class ICS3UR_Gordon_Unit3Assignment1_Surfsup1 {				//Class declaration

	public static void main(String[] args) {						//Define main()
		
		int wave = 0;												//Declare wave variable as int
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hey! How high are the waves?: ");			//Requests user input
		wave = input.nextInt();
		
		if (wave > 6)
		{
			System.out.print("\n\nGreat day for surfing!");			//If the wave value were to be greater than 6
		}
		
		if (wave < 6)												//If the wave value were to be less than 6
		{
			System.out.print("\n\nThe waves aren't that high today, check back another time.");
		}
		
		
	}
	
}
