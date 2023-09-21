/*ICS3UR_Gordon_Unit4Assignment7_FormalGreeting.java
 * Greets the user with a prefix
 * Alex Gordon
 * 10/12/20
 * ICS3UR
 */
package formalgreeting;															//Package Declaration

import java.util.Scanner;														//Import scanner for input

public class ICS3UR_Gordon_Unit4Assignment7_FormalGreeting {					//Class Declaration
	
	public static void main(String[] args) {									//Define main()
	
				String name;													//Declare Strings 
			    String sir = "Mr";
			    Scanner input = new Scanner(System.in);
			       
			    System.out.print("Please enter your name including prefix: ");	//Input
			    name = input.nextLine();
			    input.close();
			       
			    if (name.startsWith(sir)) 										//If the name starts with "Mr"
			    {
			         System.out.println("Hello, Sir.");
			    } 
			    else 															//Any other prefix
			    {
			         System.out.println("Hello, name.");
			    }
		}
}

