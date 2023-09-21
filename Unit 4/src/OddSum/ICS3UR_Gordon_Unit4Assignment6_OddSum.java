/* ICS3UR_Gordon_Unit4Assignment6_OddSum.java
 * Calculates the sum of odd numbers within a number
 * Alex Gordon 
 * 10/12/20
 * ICS3UR
 */
package OddSum;											//Package declaration

import java.util.Scanner;								//Import scanner

public class ICS3UR_Gordon_Unit4Assignment6_OddSum {	//Class declaration
	
	public static void main(String[] args) 				//Define main()
	{
		int number;										//Declare variables as int
		int i;
		int oddSum = 0;
		Scanner input = new Scanner(System.in);			//Declare input

		
		System.out.print("Please enter a value: ");		
		number = input.nextInt();						//Input
		
		for(i = 1; i <= number; i++)					//For statement & Odd number sum calculation
		{
			if(i % 2 != 0)
			{
				oddSum = oddSum + i; 
			}
		}
		System.out.println("\nThe total sum of odd Numbers up to " + number + " = " + oddSum);	//Display output
	}
}

