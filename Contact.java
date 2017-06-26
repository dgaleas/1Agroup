
/**
 * An object of this class is a contact containing info on ONE person, including
 * first name, last name, street address, phone number, and notes
 * 
 */
import java.io.Serializable;
import java.util.Scanner;

public class Contact implements Comparable<Contact>, Serializable {

	private String firstname;
	private String lastname;
	private String streetaddress;
	private String email;
	private String phonenumber;
	private String notes;
	{
	}

	/**
	 * This will read input from user and create an object containing contact
	 * info. This will include a first name, last name, street address, email,
	 * phone number, and notes about the person.
	 */

	public void readinput() {
		Scanner console = new Scanner(System.in);
		Scanner scanner;
		scanner = console;
		System.out.println("Enter First name: ");
		setFirstname(scanner.nextLine());
		System.out.println("Enter Last name: ");
		setLastname(scanner.nextLine());
/*	System.out.println("Enter Street address: ");
		setStreetaddress(scanner.nextLine());
		System.out.println("Enter email: ");
		setEmail(scanner.nextLine());
		System.out.println("Enter Phone number: ");
		setPhonenumber(scanner.nextLine());
		System.out.println("Enter Notes: ");
		setNotes(scanner.nextLine());*/

	}// End readinput

	/**
	 * This method will return the object of this class as a string.
	 */
	public String toString() {
		return "Name: "+ lastname + ", " + firstname + "\n" + "Street address: "+ streetaddress + "\n"+ "Email: " + email + "\n"+ "Phone number: " + phonenumber + "\n" + "Notes:"
				+ notes;

	}// End of toString

	/**
	 * This method will compare the object contact to another that is received
	 * from the user.
	 */

	public int compareTo(Contact o) {
		return 0;

	}

	public String getFirstname() { // gets userInput and returns the inputed
									// data
		return firstname;
	}

	public void setFirstname(String firstname) {// gets userInput and returns
												// the inputed data
		this.firstname = firstname;
	}

	public String getLastname() {// gets userInput and returns the inputed data
		return lastname;
	}

	public void setLastname(String lastname) {// gets userInput and returns the
												// inputed data
		this.lastname = lastname;
	}

	public String getStreetaddress() {// gets userInput and returns the inputed
										// data
		return streetaddress;
	}

	public void setStreetaddress(String streetaddress) {// gets userInput and
														// returns the inputed
														// data
		this.streetaddress = streetaddress;
	}

	public String getEmail() {// gets userInput and returns the inputed data
		return email;
	}

	public void setEmail(String email) { // refers to the input variable and
											// does not return a value
		this.email = email;
	}

	public String getPhonenumber() {// gets userInput and returns the inputed
									// data
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) { // refers to the input
														// variable and does not
														// return a value
		this.phonenumber = phonenumber;
	}

	public String getNotes() { // gets userInput and returns the inputed data
		return notes;
	}

	public void setNotes(String notes) { // refers to the input variable and
											// does not return a value
		this.notes = notes;
	}

}// End class
