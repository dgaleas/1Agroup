
/**
 * One instance of this class represents a list of contacts. This class will modify,
 * print, store, and open a contact list including first name, Last name, street
 * address, email, phone number, and notes on contact.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; // Imported for use case 3

public class ContactList {
	Scanner scanner = new Scanner(System.in); // for use case 3
	private ArrayList<Contact> allcontacts = new ArrayList<Contact>();

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
	 * This search will be in case insensitive. It will return a String of contacts holding the 
	 * chosen last name that the user inputs. It will tell the user the number of contacts found. 
	 * It will be in ascending order. This method will return all contacts that match the last name 
	 * inputed by the user.
	 */
	public void searchByLastName() {
		Collections.sort(allcontacts);
		System.out.print("Enter last name: ");
		String lastname = scanner.nextLine();
		String matchingLastname = "";
		int occurrences = 0;
		for (int i = 0; i < allcontacts.size(); i++) {
			Contact contact = allcontacts.get(i);
			if (lastname.equalsIgnoreCase(contact.getLastName())) {
				matchingLastname += contact + "\n";
				occurrences++;
			}
		}
		if (matchingLastname.isEmpty()) {
			System.out.println("No Contacts with that last name were found. \n");
		} else {
			System.out.println("=== " + occurrences + " Contacts Found! === \n\n" + matchingLastname);
		}
	}// End searchByLastName

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
