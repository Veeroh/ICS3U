/* Computer.java
 * The class that involves methods used for the computer.
 * Alex Gordon
 * 11/9/20
 * ICS3UR
 */
package rst1;									//Package declaration
	
import java.util.Random;						//Import utlities
import java.util.concurrent.TimeUnit;

public class Computer {							//Class declaration

	static Random rand = new Random();			//New random variable

	public static void delay1() {				//delay1 method
		try {
			TimeUnit.SECONDS.sleep(1);			//Make code sleep for 1 second
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void delay3() {				//Delay3 method
		try {
			TimeUnit.SECONDS.sleep(3);			//Make code sleep for 3 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static int hitorstand() {			//hitorstand() method
		int cpuDecision = rand.nextInt(2) + 1;	//Random value between 1 and 2
		if (cpuDecision == 2) {					//If value is 2, return 1
			return(1);
		}
		else
			return(0);							//If value is 1, return 0
	}
}
