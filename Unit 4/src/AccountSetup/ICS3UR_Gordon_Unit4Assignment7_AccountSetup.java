/*ICS3UR_Gordon_Unit4Assignment7_AccountSetup.java
 * Enters and stores your username and password
 * 10/12/20
 * Alex Gordon
 * ICS3UR
 */
package AccountSetup;											//Package declaration

import java.util.Scanner;										//Import scanner

public class ICS3UR_Gordon_Unit4Assignment7_AccountSetup {		//Class declaration
	
	public static void main(String[] args) {					//Define main()
		
		String username;										//String declaration
		String password;
		Scanner input = new Scanner(System.in);					//Declare input

		
		System.out.print("Enter a username: ");					//User Input
		username = input.nextLine();
		
		System.out.print("Enter a password that's at least 8 characters: ");
		password = input.nextLine();
		
		System.out.print("\nYour username is " + username + " and your password is " + password);	//Display output	
	}
}
