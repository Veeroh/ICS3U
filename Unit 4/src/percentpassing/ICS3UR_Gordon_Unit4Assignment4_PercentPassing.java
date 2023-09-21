/*ICS3UR_Gordon_Unit4Assignment4_PercentPassing.java
 * Displays average percentage of user's input above 70
 * Alex Gordon
 * 10/08/20
 * ICS3UR
 */
package percentpassing;											//Package Declaration

import java.util.Scanner;										//Import Scanner for input

public class ICS3UR_Gordon_Unit4Assignment4_PercentPassing {	//Class Delcaration

	public static void main(String[] args)						//Define main()
	{
		int percent = 1;										//Declare percent variable as int
		double sum = 0;											//Declare sum and average as double for better accuracy
		double sumint = 0;
		double average;
		Scanner input = new Scanner(System.in);					//Scanner input declaration

		System.out.println("Enter the number \"0\" to stop entering numbers.");	
		
		while (percent > 0 || percent < 0) {						//While user doesn't input 0, request percent
			System.out.print("\nEnter Percentage: ");
			
			percent = input.nextInt();
			
			if (percent >= 70)									//If percent is above 70, add to the average
			{
				sum = sum + percent;	
				sumint += 1;
			}
		average = sum / sumint;									//Average calculation
		System.out.println("\nThe average percent of those values above 70 is: " + average);
		}
	}
}

