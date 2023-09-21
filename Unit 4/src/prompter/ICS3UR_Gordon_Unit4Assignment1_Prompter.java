/* ICS3UR_Gordon_Unit4Assignment1_Prompter.java
 * Prompts the user to input a value between a minimum and maximum range
 * Alex Gordon
 * 10/8/20
 * ICS3UR
 */
package prompter;												//Package Declaratoin

import java.util.Scanner;										//Import Scanner for inputs
import java.util.concurrent.ThreadLocalRandom;					//Input ThreadLocalRandom for random integer

public class ICS3UR_Gordon_Unit4Assignment1_Prompter {			//Class Declaration

	public static void main(String[] args) {					//Define main()
		
		int min;												//Declare min and max value as int
		int max;
		Scanner input = new Scanner(System.in);					//Scanner input declaration

		System.out.print("Enter a minimum value: ");			//Request user for input
		min = input.nextInt();									//Input
		System.out.print("Enter a maximum value: ");
		max = input.nextInt();
		
		if (min >= max || min == max)							//If the user were to put incompatible values, this error message would show
		{
			System.out.print("\nError! Minimum value cannot be greater or equal than maximum value!\n");
		}
		
		int userinput = 0;										//Declare the user input variable as int
		int randomint = ThreadLocalRandom.current().nextInt(min,max);	//Randomize the min and max value
				
		while (userinput > randomint || userinput < randomint)			//While statement for prompting the random integer
		{
			System.out.print("\nPlease enter the number " + randomint + ": ");
			userinput = input.nextInt();
		}
		
		System.out.print("\nCorrect number inputted.");			//When the correct number is inputted
	}
}
