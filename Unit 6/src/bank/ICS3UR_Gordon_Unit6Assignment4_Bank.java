/*ICS3UR_Gordon_Unit6Assignment4_Bank.java
 * Client class for Account.java & Customer.java.
 * Alex Gordon
 * 11/1/20
 * ICS3UR
 */
package bank;												//Package Declaration

import java.util.Scanner;									//Import utilities
import java.text.NumberFormat;

public class ICS3UR_Gordon_Unit6Assignment4_Bank {			//Class declaration

	
	public static void main(String[] args) {				//Main()
		
		Account munozAccount = new Account(250, "Maria", "Munoz", "110 Glades Road", "My town", "FL", "33445");	//New Account
		
		Scanner input = new Scanner(System.in);				//New scanner input
		
		double data;
		NumberFormat money = NumberFormat.getCurrencyInstance();	
		System.out.println(munozAccount);
		
		System.out.print("Enter deposit amount: ");			//Input from user for deposit and withdrawal
		data = input.nextDouble();
		munozAccount.deposit(data);
		System.out.println("Balance is: " + money. format (munozAccount.getBalance()));
	
		System.out.print("Enter withdrawal amount: ");
		data = input.nextDouble();
		munozAccount.withdrawal(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));
		input.nextLine();									//Gets rid of buffer
		
		System.out.print("\nWould you like to change your Address? (Y for yes, N for no): ");	//Request address change
		String userinput;
		userinput = input.nextLine();						//Input
		if (userinput.equals("Y")) {						//If input is Y, execute changeAdress
			munozAccount.changeAddress();		
		}
		else
		{
			
		}	
	}
}
