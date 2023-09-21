/*ICS3UR_Gordon_Unit3Assignment9_Deliery
 * Tells the user if their package is oversized or not
 * 10/3/20
 * Alex Gordon
 * ICS3UR
 */
package delivery;										//Package Declaration

import java.util.Scanner;								//Import scanner (input)

public class ICS3UR_Gordon_Unit3Assignment9_Delivery {	//Class Declaration

	public static void main(String[] args) {			//Define main()
	
		int width;										//Declare width, length & height as int
		int length;
		int height;
		Scanner input = new Scanner(System.in);			

		System.out.print("Enter the width: ");			//Requests the input from the user
		width = input.nextInt();	
		System.out.print("Enter the length: ");
		length = input.nextInt();
		System.out.print("Enter the height: ");
		height = input.nextInt();
		
		if (width <= 10 && length <= 10 && height <= 10)	//If the package meets the less than 10 requirements
		{
			System.out.print("\nAccepted!");	
		}
		
		else
		{
			System.out.print("\nRejected...");				//Else reject the package
		}
	}
}
