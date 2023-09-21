/*Coin.java (ICS3UR_Gordon_Unit5Assignment8_CoinFlip.java is client code)
 * Creates a random variable from a coinflip and returns value
 * Alex Gordon
 * 10/22/20
 * ICS3UR
 */
package coinflip1;					//Package delcaration

import java.util.Random;			//Import random

public class Coin {					//Class declaration

	private int faceUp;				//Public faceUp variable for returning
	public void flipCoin() {
		
		int max = 2;				//Max value for random
		Random rand = new Random();	//Declare random
		
		faceUp = rand.nextInt(max);	//Create random variable between 0 and 1
	}
	
	public int showFace() {			//showFace to return value
		return(faceUp);
	}
}

	