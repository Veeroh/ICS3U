/*Circle.java
 * Determines the circumference from the radius of a circle
 * Alex Gordon
 * 10/22/20
 * ICS3UR
 */
package circle1;											//Package declaration

public class Circle {											//Class declaration
	
	private static final double PI = 3.14;						//Final variable of PI
	private double radius;										//Public variable of radius
	
	public double circumference(double newCircumference)		//Circumference method
	{
		return newCircumference = (PI*2) * newCircumference;	//Calculates circumference from radius, then returns value
	}
	
	public void Circle()										//Circle method
	{
		radius = 1; 
	}
	
	public void setRadius(double newRadius)						//setRadius method
	{
		radius = newRadius;
	}
	
	public double area()										//area method that calculates area of circle
		{
			double circleArea;
			circleArea = PI * radius * radius;
			return (circleArea);
		}
	
	public double getRadius()									//getRadius method
	{
			return(radius);
	}
}

