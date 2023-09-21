/*ICS3UR_Gordon_Unit4Assignment2_Evens.java
 * Displays all the even numbers from 1 to 20
 * Alex Gordon
 * 10/8/20
 * ICS3UR
 */
package evens;											//Package Declaration

public class ICS3UR_Gordon_Unit4Assignment2_Evens {		//Class Declaration

	public static void main(String[] args) {			//Define main()
		
		int value = 0;									//Declare default value as int
		System.out.print("Even numbers: \n");			
		
		while (value < 20)								//While statement that displays all even numbers up to 20
		{
			value = value + 2;
			System.out.println(value);
		}
	}
}
