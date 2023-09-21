/*ICS3UR_Gordon_Unit4Assignment2_Hailstone.java
 * Solves hailstone calculation
 * Alex Gordon
 * 10/14/20
 * ICS3UR
 */
package hailstone;												//Package Declaration

import java.util.Scanner;										//Import Scanner

public class ICS3UR_Gordon_Unit4FinalAssignment2_Hailstone {	//Class Declaration
	
	public static void main(String[] args) {					//Define main()
	
		int integer;											//Declare variables as int
		int counter = 0;
		Scanner input = new Scanner(System.in);					//Declare input
		
		System.out.print("Enter a value: ");					//Input from user
		integer = input.nextInt();
		
		if (integer < 1 || integer > 200)						//Invalid value when out of range
		{
			System.out.print("Invalid value. Please try again.");
		}
		
		else 	
		{
			do {												//Hailstone calculation process
				if (integer % 2 == 0)
				{
					integer = integer / 2;
				}
				else
				{
					integer = (integer * 3) + 1;
				}
				System.out.print(integer + ", ");
				counter++;
			}
		
			while (integer != 1);								//While integer doesn't equal 1, repeat loop
			{
				System.out.print("\nThis process took " + counter + " times.");
			}
		}
	}
}
