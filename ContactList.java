import java.io.Serializable;
import java.util.ArrayList;

/**
 * One object of this class represents a list contacts This class will modify,
 * print, store, and open a contact list including first name, Last name, street
 * address, email, phone number, and notes on contact.
 * 
 * @author Donaldo
 *
 */

public class ContactList {
	public ArrayList<Contact> allcontacts = new ArrayList<Contact>();

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

}// End of class
