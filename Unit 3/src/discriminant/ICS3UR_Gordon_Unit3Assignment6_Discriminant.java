/*ICS3UR_Gordon_Unit3Assignment6_Discriminant.java
 * Determines how many roots are in a discriminant
 * 9/30/20
 * Alex Gordon
 * ICS3UR
 */
package discriminant;											//Package Declaration

import java.util.Scanner;										//Import scanner (input)

public class ICS3UR_Gordon_Unit3Assignment6_Discriminant {		//Class declaration

	  public static void main(String[] args) {					//Define main()

	        double a, b, c;
			Scanner input = new Scanner(System.in);

	        System.out.print("Please enter A value: ");			//Requests input from user
	        a = input.nextDouble();
	        System.out.print("Please enter B value: ");
	        b = input.nextDouble();
	        System.out.print("Please enter C value: ");
	        c = input.nextDouble();
	        
	        double discriminant = b * b - 4 * a * c;			//Discriminant calculation

	        if(discriminant < 0) 								//No roots if statement
	        {
	            System.out.format("No roots");
	        }
	        
	        else if(discriminant == 0) 							//One root if statement
	        {
	            System.out.format("One root");
	        }
	        
	        else 												//Two roots else statement
	        {
	            System.out.format("Two roots");
	        }
	  }
}

