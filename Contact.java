
/**
 * An instance of this class is a contact containing info on ONE person, including
 * first name, last name, street address, phone number, and notes.
 * 
 */
import java.util.Scanner;

public class Contact implements Comparable<Contact> {
	private String firstname;
	private String lastname;
	private String streetaddress;
	private String email;
	private String phonenumber;
	private String notes;

	/**
	 * This will read input from user and create an object containing contact
	 * info. This will include a first name, last name, street address, email,
	 * phone number, and notes about the person.
	 * 
	 */

	public void readInput() {
		System.out.println("Please enter the details below to create a new contact.");
		Scanner console = new Scanner(System.in);
		System.out.println("Enter First name: ");
		Scanner scanner;
		scanner = console;
		setFirstname(scanner.nextLine());
		System.out.println("Enter Last name: ");
		String input = (scanner.nextLine());
		while(input.length() == 0){
			System.out.println("You must enter last name");
			input = scanner.nextLine();
		}
		setLastname(input);
		System.out.println("Enter Street address: ");
		setStreetaddress(scanner.nextLine());
		System.out.println("Enter email: ");
		setEmail(scanner.nextLine());
		System.out.println("Enter Phone number: ");
		setPhonenumber(scanner.nextLine());
		System.out.println("Enter Notes: ");
		setNotes(scanner.nextLine());

	}// End readinput

	/**
	 * This method will return the object of this class as a string.
	 */
	public String toString() {
		return lastname + ", " + firstname + "\n" + streetaddress + "\n" + email + "\n" + phonenumber + "\n" + "Notes:"
				+ notes;

	}// End of toString

	/**
	 * This method will compare the object contact to another that is received
	 * from the user. It will return a negative number if the first goes before the other
	 * alphabetically.it will return a positive number if it goes after, and 0 if they 
	 * are the same.
	 */

	public int compareTo(Contact o) {
		return 0;

	}

	/**
	 * Gets userInput and returns the inputed data.
	 */
	public void setFirstname(String firstname) {

		this.firstname = firstname;
	}

	/**
	 * Gets userInput and returns the inputed data.
	 */
	public void setLastname(String lastname) {

		this.lastname = lastname;
	}

	/**
	 * Gets userInput and returns the inputed data.
	 */
	public void setStreetaddress(String streetaddress) {

		this.streetaddress = streetaddress;
	}

	/**
	 * Refers to the input variable and does not return a value.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Refers to the input variable and does not return a value.
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	/**
	 * Refers to the input variable and does not return a value.
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	/**
	 * This resolved getLastName
	 */
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastname;
	}

}// End class
