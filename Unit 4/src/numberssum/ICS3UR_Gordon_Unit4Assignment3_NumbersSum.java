/*ICS3UR_Gordon_Unit4Assignment3_NumberSum.java
 * Displays numbers 1 though the number entered by the user, then displays the total sum of all those numbers
 * Alex Gordon
 * 10/8/20
 * ICS3UR
 */
package numberssum;											//Package Declaration

import java.util.Scanner;									//Import scanner for user input

public class ICS3UR_Gordon_Unit4Assignment3_NumbersSum {	//Class declaration

	public static void main(String[] args) {				//Define main()
		int userinput;										//Declare variables as int
		int totalsum = 0;
		int integer = 0;
		Scanner input = new Scanner(System.in);				//Scanner Input Declaration

		System.out.print("Enter a number: ");				//Input from user
		userinput = input.nextInt();
		
		while(integer < userinput)							//While statement that counts up the numbers
		{
			integer = integer + 1;
			System.out.println(integer);
			totalsum = totalsum + integer;					//Adds current integer to totalsum
		}
		
		System.out.print("\nTotal Sum of numbers: " + totalsum);	//Displays total sum
	}
}
