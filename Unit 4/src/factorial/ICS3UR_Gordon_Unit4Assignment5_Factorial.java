/*ICS3UR_Gordon_Unit4Assignment5_Factorial.java
 * Calculates factorial
 * Alex Gordon
 * 10/12/20
 * ICS3UR
 */
package factorial;											//Package declaration

import java.util.Scanner;									//Import scanner for input

public class ICS3UR_Gordon_Unit4Assignment5_Factorial {		//Class declaration
	
	public static void main(String[] args)					//Define main()
	{
		int n;												//Temporary n value for user input as int
		int total = 1;										//Total value as int
		Scanner input = new Scanner(System.in);				//Declare input

		System.out.print("Enter a value: ");			
		n = input.nextInt();								//Input
		
		while (n > 1)										//While statement for calculation
		{
			total = total * n;
			n = n - 1;
		}
		
		System.out.print("\nTotal Factorial: " + total);	//Display output
	}

}
