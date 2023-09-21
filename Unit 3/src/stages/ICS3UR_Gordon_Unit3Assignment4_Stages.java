/*ICS3UR_Gordon_Unit3Assignment4_Stages.java
 * Determines the stage of a person by their age
 * Alex Gordon
 * 9/30/20
 * ICS3UR
 */
package stages;											//Package declaration

import java.util.Scanner;								//Import scanner (Input)

public class ICS3UR_Gordon_Unit3Assignment4_Stages {	//Class declaration

	public static void main(String[] args) {			//Define main()
		int age;										//Declare "age" as int
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the age: ");			//Request input from user
		age = input.nextInt();
		
		if (age >= 18)									//If statement - adult
		{
			System.out.print("Adult");
		}
		
		if (age <= 5)									//If statement - Toddler
		{
			System.out.print("Toddler");
		}
		
		if (age <= 10 && age > 5)						//If statement - Child
		{
			System.out.print("Child");
		}
		
		if (age <= 12 && age > 10)						//If statement - Preteen
		{
			System.out.print("Preteen");
		}
		
		if (age < 18 && age > 12)						//If statement - Teen
		{
			System.out.print("Teen");
		}
	}
}
