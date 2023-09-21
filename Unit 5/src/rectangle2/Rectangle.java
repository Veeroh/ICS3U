/*Rectangle.java
 * Determines perimeter and area from length and width of rectangle
 * Alex Gordon
 * 10/22/20
 * ICS3UR
 */
package rectangle2;							//Package declaration

public class Rectangle {					//Class declaration
	
	private int length;						//Length and width variables for all methods to access
	private int width;
	
	public void dimensions()				//Dimensions constructor
	{
		
	}
	
	public void dimensions(int l, int w)	
	{
		length = l;
		width = w;
	}
	
	public int getArea() 					//getArea method
	{
		int area;
		area = length * width;
		return area;
	}
	
	public int getPerimeter() 				//getPerimeter method
	{
		int perimeter;
		perimeter = (length * 2) + (width * 2);
		return perimeter;
	}
	
	public static void displayAreaFormula()	//New displayAreaForumla method
	{
		System.out.print("The formula for a rectangle's area is A = L * W."); 
	}
}
