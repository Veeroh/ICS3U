/* ICS3UR_Gordon_Unit3Assignment8_RandomNum
 * Displays a random number in between two numbers inputted by the user
 * 10/3/20
 * Alex Gordon
 * ICS3UR
 */
package randomnum;													//Package Declaration

import java.util.Scanner;											//Import scanner and random utility (Input and random)
import java.util.Random;

public class ICS3UR_Gordon_Unit3Assignment8_RandomNum {				//Class declaration
	
	public static void main(String[] args) {						//Define main()
	
		int numlow;													//Declare low and high numbers as int
		int numhigh;
		Scanner input = new Scanner(System.in);						//Input declarion
		Random r = new Random();									//Random declaration

		System.out.print("Please enter the lowest number: ");		//Requests user input
		numlow = input.nextInt();
		System.out.print("Please enter the highest number: ");
		numhigh = input.nextInt();
		
		int result = r.nextInt(numhigh-numlow) + numlow;			//Calculation of random
		System.out.print("\nYour random digit is: " + result);		//Resulting output
	}
}
