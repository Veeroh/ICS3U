/*ICS3UR_Gordon_Unit5Assignment10_Rectangle1.java
 * Client class for Rectangle.java. Gets the dimensions from the user and displays the area and perimeter.
 * Alex Gordon
 * 10/22/20
 * ICS3UR
 */
package rectangle2;											//Package declaration

import java.util.Scanner;									//Import scanner for input

public class ICS3UR_Gordon_Unit5Assignment12_Rectangle2 {	//Class declaration

	public static void main(String[] args) 					//Define main()
	{ 
		int length;											//Length and width variables as int
		int width;
		Scanner input = new Scanner(System.in);				//Declare input
		
		System.out.print("Enter the length: ");				//User input for length and width
		length = input.nextInt();
		System.out.print("Enter the width: ");
		width = input.nextInt();
		
		Rectangle shape = new Rectangle();					//Rectangle class
		
		shape.dimensions(length, width); 					//Calls dimension method/constructor
		System.out.println("\nArea of rectangle: " + shape.getArea() + " units."); 		//Display output
		System.out.println("Perimeter of rectangle: " + shape.getPerimeter() + " units."); 
		shape.displayAreaFormula();
	}
}
