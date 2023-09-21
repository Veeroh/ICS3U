/*Rectangle.java
 * Determines if theres a different between perimeters in rectangles
 * Alex Gordon
 * 10/22/20
 * ICS3UR
 */
package rectangle3;								//Package declaration

public class Rectangle {						//Class declaration
	
	private int length;							//Local variables for rectangle length & width
    private int width;
    
    public Rectangle(int length1, int width1)	//Rectangle constructor
    {
        length = length1;
        width = width1;
    }
    
    public int getLength()						//getLength method
    {
        return(length);
    }
    
    public int getWidth()						//getWidth method
    {
        return(width);
    }
    
    public boolean equals(Object testObj){		//Equals override
        if (!(testObj instanceof Rectangle)){	//If rectangle is same as testObj
             return false;
        }
        
        Rectangle otherRectangle = (Rectangle)testObj;	//Else returns value if the other length and width equal the same
        return (this.length == otherRectangle.length) && (this.width==otherRectangle.width);
    }
    
    public String toString() {					//Returns a string to represent rectangle perimeter
		String rectanglePerimeter = "Rectangle has a perimeter of " + length + " x " + width;
		return(rectanglePerimeter);
	}
}

