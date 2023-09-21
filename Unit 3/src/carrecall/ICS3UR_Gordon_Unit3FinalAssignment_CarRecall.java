/*ICS3UR_Gordon_Unit3FinalAssignment_CarRecall.java
 * Determines if your car is defective or not by using the car model number.
 * 10/6/20
 * Alex Gordon
 * ICS3UR
 */
package carrecall;													//Package Declaration

import java.util.Scanner;											//Import Scanner (Input)

public class ICS3UR_Gordon_Unit3FinalAssignment_CarRecall {			//Class Declaration

	public static void main(String[] args) {						//Define main()
		
		System.out.print("Please enter your car model number: ");	//Requests input from user
		Scanner input = new Scanner(System.in);
		
		int carnum = input.nextInt();								//Input
		
		switch(carnum)												//Switch statement to determine which car model is defective
		{
		case 119:
			System.out.print("\nYour car is defective. It must be repaired.");
			break;
		case 179:
			System.out.print("\nYour car is defective. It must be repaired.");
			break;
		case 189:
			System.out.print("\nYour car is defective. It must be repaired.");
			break;
		case 195:
			System.out.print("\nYour car is defective. It must be repaired.");
			break;
		case 221:
			System.out.print("\nYour car is defective. It must be repaired.");
			break;
		case 780:
			System.out.print("\nYour car is defective. It must be repaired.");
			break;
		default:
			System.out.print("\nYour car is not defective.");
			break;
		}
	}
}
