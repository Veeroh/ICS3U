/*Circumference.java
Calculates the circumference of a circle from a radius and detemrines if the value is negative or not
Alex Gordon
9/27/20
ICS3UR
 */
package circumference2;																//Package Declaration

import java.util.Scanner;															//Import Scanner (Input)

public class ICS3UR_Gordon_Unit3Assignment3_Circumference2 {						//Class Declaration

	public static void main(String[] args) {										//Define main()
		
		double radius;																//Declares variables as double
		double circumference;
		double pi = 3.1415;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius of the circle: ");						//Requests input from user
		radius = input.nextDouble();
		
		if (radius < 0)
		{
			System.out.print("Negative radius is illegal.");
		}
		
		if (radius > 0)
		{
		circumference = 2 * pi * radius;											//Calculation of circumference
		System.out.print("\nThe circumference of your circle is " + circumference + " units."); //Displays output
		}
	}
		
}

