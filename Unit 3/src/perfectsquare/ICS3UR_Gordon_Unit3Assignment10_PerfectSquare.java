/*ICS3UR_Gordon_Unit3Assignment10_PerfectSquare.java
 * Tells the user whether an integer is a perfect square or not.
 * 10/3/20
 * Alex Gordon
 * ICS3UR
 */
package perfectsquare;											//Package Declaration

import java.util.Scanner;										//Inport scanner and math utilities
import java.lang.Math;

public class ICS3UR_Gordon_Unit3Assignment10_PerfectSquare {	//Class declaration

	public static void main(String[] args) {					//Define main()
		
	double integer;												//Declare variables as double
	double sqrt;
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");						//Requests input from user
	integer = input.nextDouble();
	
	sqrt = Math.sqrt(integer);									//Calculation
	int result = (int) sqrt;									//Converts to int to remove decimals
	result = result * result;

	if (result == integer)										//If the calculation equals the input from the user
	{
		System.out.print("\nThe integer IS a perfect square.");
	}
	
	else														//Anything else
	{
		System.out.print("\nThe integer ISN'T a perfect square.");
		}	
	}
}
