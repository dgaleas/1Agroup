import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * One object of this class represents a list contacts. This class will modify,
 * print, store, and open a contact list including first name, last name, street
 * address, email, phone number, and notes on contact.
 * 
 */

public class ContactList {
	public ArrayList<Contact> allcontacts = new ArrayList<Contact>();
	private Object lastname;
	private Object firstname;
	private Object streetaddress;
	private Object email;
	private Object phonenumber;
	private Object notes;

	public void Details(ContactList contact) {
		this.firstname = contact.firstname;
		this.lastname = contact.lastname;
		this.streetaddress = contact.streetaddress;
		this.email = contact.email;
		this.phonenumber = contact.phonenumber;
		this.notes = contact.notes;
	}
	/** 
	 * 
	 * 
	 */
	public ContactList() {
	}

	public String getFirstname(String Firstname) {
		String firstname = Firstname;
		return firstname;
	}
	/** 
	 * 
	 * 
	 */
	public String getLastname() {
		String lastname = "";
		return lastname;
	}
	/** 
	 * 
	 * 
	 */
	public String getStreetaddress() {
		Scanner scanner;
		scanner = new Scanner(System.in);
		String streetaddress = (scanner.nextLine());
		;
		return streetaddress;
	}
	/** 
	 * 
	 * 
	 */
	public String getEmail() {
		String email = "";
		return email;
	}
	/** 
	 * 
	 * 
	 */
	public int getPhonenumber() {
		int phonenumber = (0);
		return phonenumber;
	}
	/** 
	 * 
	 * 
	 */
	public String getNotes() {
		String notes = "";
		return notes;
	}

	/**
	 * This will print entire list of contacts to console.
	 * 
	 * @return
	 */
	public String showcontactlist() {
		return "showcontactlist() works";
	}// End of Showcontact

	/**
	 * This Method will return all contacts that match the last name inputed by
	 * user.
	 * 
	 * @return
	 */

	public String checkname() {
		return "checkname() works";
	}// End Checkname

	/**
	 * This method will save contact list to a file on hard disk.
	 */
	public void save() {

	}// End Save

	/**
	 * This method will open whatever file was saved when program runs.
	 */

	public void open() {

	}// End of open

	/**
	 * This will return the list of contacts as a string.
	 */
	public String toString() {
		return "toString() works";
	}// End of toString

}
