/*ICS3UR_Gordon_Unit5Assignment3_DisplayBox.java
 * Creates and displays a box with a length and width according to the user's value.
 * Alex Gordon
 * 10/16/20
 * ICS3UR
 */
package displaybox;											//Package Declaration

import java.util.Scanner;									//Import Scanner for input

public class ICS3UR_Gordon_Unit5Assignment3_DisplayBox {

	public static void main(String[] args) {
	    int height2 = 0;									//Declare height and length variable as int 
	    int length2 = 0;
	    Scanner input = new Scanner(System.in);

	    System.out.print("Enter the height of the box: ");	//User input
	    height2 = input.nextInt();
	    System.out.print("Enter the width of the box: ");
	    length2 = input.nextInt();
	    
	    drawbox(height2,length2);	
	  }
	   
	public static void drawbar(int height,int length) {		//Drawbar method
		for(int counter = 1; counter <= height; counter++)
			{
			   System.out.print(" *");						//Box character
			}
		   		System.out.println(); 
	  }
	
	   public static void drawbox(int width3,int height3) {	//Drawbow method
	     for(int counter1 = 1;counter1 <= height3;counter1++)
	     {					
	       drawbar(width3,height3);
	     } 
	 }
}
         






