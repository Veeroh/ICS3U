/*Customer.java
 * Creates new customer, and changes newAddress if user chooses so
 * Alex Gordon
 * 11/1/20
 * ICS3UR
 */
package bank;				//Package Declaration

import java.util.Scanner;	//Import Scanner

public class Customer {		//Class Declaration

	Scanner input = new Scanner (System.in);	//New private scanner input variable
	private String firstName, lastName, street, city, state, zip;	//New address variables
	
	public Customer(String fName, String Name, String str, String c, String s, String z) {	//Customer
	firstName = fName;
	lastName = Name;
	street = str;
	city = c;
	state = s;
	zip = z;
	}
	
	public Customer(String fName, int i, String str, String city2, String st, String zip2) {
		
	}
	
	public void changeStreet(String street) {			//changeStreet() method
		System.out.print("Enter the new Street: ");
		street = input.nextLine();
		this.street = street;
		
	}
	
	public void changeCity(String city) {				//changeCity() method
		System.out.print("Enter the new City: ");
		city = input.nextLine();
		this.city = city;

	}
	
	public void changeState(String state) {				//changeState() method
		System.out.print("Enter the new State: ");
		state = input.nextLine();
		this.state = state;
		
	}
	
	public void changeZip(String zip) {					//changeZip() method
		System.out.print("Enter the new Zip code: ");
		zip = input.nextLine();
		this.zip = zip;
	}

	public String toString() {							//toString() method
	String custString;
	custString = firstName + " " + lastName + "\n";
	custString += street + "\n";
	custString += city + ", " + state + " " + zip + "\n";
	return(custString);
	}
}
	

