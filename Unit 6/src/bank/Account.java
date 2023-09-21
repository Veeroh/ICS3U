/* Account.java
 * Determines and displays the account values. Also uses the new changeAddress() method.
 * Alex Gordon
 * 11/1/20
 * ICS3UR
 */
package bank;										//Package Declaration

import java.text.NumberFormat;						//Import NumberFormat

public class Account {								//Class Declaration

	private double balance;							//Private variable declarations

	private Customer cust;
	
	public Account(double bal, String fName, String Name, String str, String city, String st, String zip) {	//Account constructor
	
		balance = bal;
		cust = new Customer(fName, Name, str, city, st, zip);
	}
	
	public double getBalance() {					//getBalance method
		
		return(balance);
	}
	
	public void changeAddress() {             		//New changeAddress method
		cust.changeStreet(null);
		cust.changeState(null);
		cust.changeCity(null);
		cust.changeZip(null);
		System.out.print("\n");
		System.out.println("New Address Saved!");
		System.out.println(cust.toString());
	}

	
	public void deposit(double amt) {				//Deposit method
	
		balance += amt;
	}
	
	public void withdrawal(double amt) {			//Withdrawal method
	
		if (amt <= balance) {
			balance -= amt;
		}
			else {
				System.out.println("Not enough money in account.");
			}
	}
	
	public String toString() {						//toString method
	String accountString;
	NumberFormat money = NumberFormat.getCurrencyInstance();
	accountString = cust.toString();
	accountString += "\nCurrent balance is " + money.format(balance);
	return (accountString);
	
	}
}
	

