/*ICS3UR_Gordon_Unit4FinalAssignment1_Necklace.java
 * Solves the necklace problem using two digits
 * Alex Gordon
 * 10/14/20
 * ICS3UR
 */
package necklace;										//Package Declaration

import java.util.Scanner;								//Import Scanner

public class ICS3UR_Gordon_Unit4FinalAssignment1 {		//Class Declaration
	
	public static void main(String[] args) {			//Define main()
		
		int num1;										//Declare values as int
		int num2;
		int num3;
		int stop1;
		int stop2;
		int counter = 0;
		Scanner input = new Scanner(System.in);			//Declare input
		
		System.out.print("Enter the first value: ");	//Input values from user
		num1 = input.nextInt();
		System.out.print("Enter the second value: ");
		num2 = input.nextInt();
		
		stop1 = num1;
		stop2 = num2;
		
		System.out.print(num1 + " " + num2 + " ");		//Display first two digits
		
		do 												//Do statement with calculation
		{
			num3 = (num1 + num2) % 10;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
			counter++;
		}
		
		while (num1 != stop1 || num2 != stop2);			//While statement that continues when the
		{												//digit doesn't equal the first digit
			System.out.print("\nThis process took " + counter + " steps.");
		}
	}
}
