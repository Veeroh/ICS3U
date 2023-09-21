/*ICS3UR_Gordon_Unit3Assignment7_Hurricane
 * Displays the speed of a hurricane class.
 * 9/30/20
 * Alex Gordon
 * ICS3UR
 */
package hurricane;																	//Package Declaration

import java.util.Scanner;															//Import Scanner (Input)

public class ICS3UR_Gordon_Unit3Assignment7_Hurricane {								//Class Declaration

	public static void main(String[] arg) {											//Define main()
		
		int category;																//Declare category variable
		Scanner input = new Scanner(System.in);

		System.out.print("What category hurricane would you like to see?: ");		//Request input from user
		category = input.nextInt();
		
		switch(category)															//Switch statement to determine category
		{
		case 1:
			System.out.print("\n74-95 mph or 64-82 kt or 119-153 km/hr");
			break;
			
		case 2:
			System.out.print("\n96-110 mph or 83-95 kt or 154-177 km/hr");
			break;

		case 3:
			System.out.print("\n111-130 mph or 96-113 kt or 178-209 km/hr");
			break;
			
		case 4:
			System.out.print("\n131-155 mph or 114-135 kt or 210-249 km/hr");
			break;
			
		case 5:
			System.out.print("\ngreater than 155 mph or 135 kt or 249 km/hr");
			break;
			
		default:
			System.out.print("\nThat isn't a valid category.");
		}
	}
}
