/* ICS3UR_Gordon_RST1.java
 * Client code of Game.java, and starting area of code. Allows player to choose whether to play with a computer or another player.
 * Alex Gordon
 * 11/9/20
 * ICS3UR
 */
package rst1;										//Package declaration

import java.util.Scanner;							//Import utilites

public class ICS3UR_Gordon_RST1 {					//Class declaration
	
	public static void main(String[] args) {		//main() method
		
		Scanner input = new Scanner(System.in);		//Scanner variable
		Game user = new Game();						//Call Game.java by using a variable

		System.out.println("Welcome to Game of 21. Enter 1 to play with a computer, or 2 to play with another player.");
		int userStartNum = input.nextInt();			//Allow player to choose wheter to play with a computer or 2 player.
				
		if (userStartNum == 1) {					//If input is 1, call PlayerVsComputer() in game.java
			user.PlayerVsComputer();		
		}
		
		if (userStartNum == 2) {					//If input is 2, call PlayerVsPlayer() in game.java
			user.PlayerVsPlayer();
		}
		
		else {										//Else invalid value
			System.out.println("Error - Invalid Value!");
		}		
	}
}
