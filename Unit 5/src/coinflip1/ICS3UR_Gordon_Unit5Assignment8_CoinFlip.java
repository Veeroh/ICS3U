/* ICS3UR_Gordon_Unit5Assignment8_CoinFlip.java
 * Client Code for Coin.java
 * Alex Gordon
 * 10/22/20
 * ICS3UR
 */
package coinflip1;

public class ICS3UR_Gordon_Unit5Assignment8_CoinFlip {

	public static void main(String[ ] args) { 

		Coin nickel = new Coin(); 
		nickel.flipCoin(); 
		
		if (nickel.showFace() == 0) { 
			System.out.println("Heads up!"); 
		}
		
		else { 
			System.out.println("Tails up!");
		}
	}
}
