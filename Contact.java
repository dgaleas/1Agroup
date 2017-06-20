
/**
 * An object of this class is a contact containing info on ONE person, including
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
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Firstname: ");
		Scanner scanner;
		scanner = console;
		setFirstname(scanner.nextLine());
		System.out.println("Enter Lastname: ");
		setLastname(scanner.nextLine());
		System.out.println("Enter Streetaddress: ");
		setStreetaddress(scanner.nextLine());
		System.out.println("Enter email: ");
		setEmail(scanner.nextLine());
		System.out.println("Enter Phonenumber: ");
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
	 * from the user. It is not being used for the current task, but is
	 * important to the next task.
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

}// End class
