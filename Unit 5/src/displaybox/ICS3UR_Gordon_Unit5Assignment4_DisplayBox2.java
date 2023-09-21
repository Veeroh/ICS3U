/*ICS3UR_Gordon_Unit5Assignment4_DisplayBox2.java
 * Makes a box of characters depending on user's input of dimensions and characters
 * Alex Gordon
 * 10/21/20
 * ICS3UR
 */
package displaybox;

import java.util.Scanner;

public class ICS3UR_Gordon_Unit5Assignment4_DisplayBox2 {

	
	public static void main(String[] args) {
	    int height2 = 0;									//Declare height and length variable as int 
	    int length2 = 0;
	    String userinput; 
	    String symbol = " *";
	    Scanner input = new Scanner(System.in);

	    System.out.print("Enter the height of the box: ");	//User input
	    height2 = input.nextInt();
	    System.out.print("Enter the width of the box: ");
	    length2 = input.nextInt();
	    input.nextLine();
	    System.out.print("Would you like to use a different character for the box? (Y for yes): ");
	    userinput = input.nextLine();						//Requests if different char is used
	    
	    if (userinput.equals("y") || userinput.equals("Y"))	//If statement for char input
	    {
	    	System.out.print("Enter the symbol: ");
		    symbol = input.nextLine();
	    }
	    
	    else
	    {
	    	System.out.print("Box character is default.\n");
	    }

	    drawbox(height2,length2,symbol);	
	  }
	   
	public static void drawbar(int height,int length, String symbol2) {		//Drawbar method
		for(int counter = 1; counter <= height; counter++)
			{
			   System.out.print(" " + symbol2);				//Box character
			}
		   		System.out.println(); 
	  }
	
	   public static void drawbox(int width3,int height3, String symbol1) {	//Drawbox method
	     for(int counter1 = 1;counter1 <= height3;counter1++)
	     {					
	       drawbar(width3,height3,symbol1);
	     } 
	 }
}
