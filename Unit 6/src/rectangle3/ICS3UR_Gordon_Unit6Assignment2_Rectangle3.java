/*ICS3UR_Gordon_Unit6Assignment2_rectangle3.java
 * Client code for Rectangle.java
 * Alex Gordon
 * 10/30/20
 * ICS3UR
 */
package rectangle3;														//Package Declaration

import java.util.Scanner;												//Import Scanner for input
	
public class ICS3UR_Gordon_Unit6Assignment2_Rectangle3 {				//Class Declaration

	public static void main(String[] args) 								//Define main()
	{ 		
		Scanner input = new Scanner(System.in);							//Declare input
		System.out.print("Enter the length for the 1st rectangle: ");	//Get input from user
		int length1 = input.nextInt();
		System.out.print("Enter the width for the 1st rectangle: ");
		int width1 = input.nextInt();
		System.out.print("\nEnter the length for the 2nd rectangle: ");
		int length2 = input.nextInt();
		System.out.print("Enter the width for the 2nd rectangle: ");
		int width2 = input.nextInt();
		System.out.print("\n");
		
		Rectangle spot1 = new Rectangle(length1 , width1);				//Create new rectangle class
		Rectangle spot2 = new Rectangle(length2, width2);
		
		if (spot1.equals(spot2)) {										//If rectangle objects are equal
			System.out.println("Objects are equal.");
		}
	
			else {
				System.out.println("Objects are not equal.");
			}
		
		System.out.println(spot1.toString());							//Print toString
	
		System.out.println(spot2.toString());
	}
}

