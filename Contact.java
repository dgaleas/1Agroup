
/**
 * An object of this class is a contact containing info on ONE person, including
 * first name, last name, street address, phone number, and notes
 * 
 */
import java.util.Scanner;

public class Contact implements Comparable<Contact> {
	private String firstname;
	private String lastname;
	private String streetaddress;
	private String email;
	private int phonenumber;
	private String notes;
	public Contact (String firstname, String lastname, String streetaddress,
	String email, String notes,int phonenumber) {
	}

	/**
	 * This will read input from user and create an object containing contact
	 * info. This will include a first name, last name, street address, email,
	 * phone number, and notes about the person.
	 * 
	 * @return
	 */

	public void readinput() {
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
		setPhonenumber(scanner.nextInt());
		System.out.println("Enter Notes: ");
		setNotes(scanner.nextLine());

	}// End readinput

	/**
	 * This method will return the object of this class as a string.
	 */
	public String toString() {
		return "toString() works";

	}// End of toString

	/**
	 * This method will compare the object contact to another that is received
	 * from the user.
	 */

	public int compareTo(Contact o) {
		return 0;

	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getStreetaddress() {
		return streetaddress;
	}

	public void setStreetaddress(String streetaddress) {
		this.streetaddress = streetaddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}// End class
