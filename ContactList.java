
/**
 * One object of this class represents a list of contacts. This class will modify,
 * print, store, and open a contact list including first name, Last name, street
 * address, email, phone number, and notes on contact.
 */
import java.util.ArrayList;

public class ContactList {
	public ArrayList<Contact> allcontacts = new ArrayList<Contact>();

	public void addContact(Contact con) {
		allcontacts.add(con);
	}// end addcontact

	/**
	 * This will print entire list of contacts to console.
	 */
	public void showContactList() {
		for (int i = 0; allcontacts.size() > i; i++) {
			System.out.println(allcontacts.get(i).toString());
		} // end of for
	}// End of Showcontact

	/**
	 * This method will return all contacts that match the last name inputed by
	 * user.
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

}
