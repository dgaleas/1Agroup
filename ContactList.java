
/**
 * One instance of this class represents a list of contacts. This class will modify,
 * print, store, and open a contact list including first name, Last name, street
 * address, email, phone number, and notes on contact.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;
public class ContactList implements Serializable {
	private ArrayList<Contact> allcontacts = new ArrayList<Contact>();
	/**
	 * This will sort the contacts by last name. or first name if same
	 */
	public void sort() {//DG
		Collections.sort(allcontacts);
	}
	/**
	 * This will add the contact created to the list
	 */
	public void addContact(Contact con) {//DG
		allcontacts.add(con);
	}// end addcontact

	/**
	 * This will print entire list of contacts to console.
	 */
	public void showContactList() {//DG
		for (int i = 0; allcontacts.size() > i; i++) {
			System.out.println(allcontacts.get(i).toString());
		} // end of for
	}// End of Showcontact

	/**
	 * This search will be in case insensitive. It will return a String of
	 * contacts holding the chosen last name that the user inputs. It will tell
	 * the user the number of contacts found. It will be in ascending order.
	 * This method will return all contacts that match the last name inputed by
	 * the user.
	 */
	// RJ
	public void searchByLastName() {//RJ
		Scanner scanner = new Scanner(System.in);
		Collections.sort(allcontacts);
		System.out.print("Enter last name: ");
		String lastname = scanner.nextLine();
		String matchingLastname = "";
		int occurrences = 0;
		for (int i = 0; i < allcontacts.size(); i++) {
			Contact contact = allcontacts.get(i);
			if (lastname.equalsIgnoreCase(contact.getlastname())) {
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
	public void save() {//JW
		System.out.println("save method");

		try { // Catch errors in I/O if necessary.
			FileOutputStream saveFile = new FileOutputStream("SaveObj.sav");// Open a file to write to, named SaveObj.sav.
			System.out.print("1st");
			ObjectOutputStream save = new ObjectOutputStream(saveFile); //Create an ObjectOutputStream to put objects into save file.
			System.out.print("2nd");
			save.writeObject(allcontacts);// Writes and saves the contacts to the file
			System.out.print("3rd");
			save.close();// closes the file and also saveFile.
			System.out.println("done writing");
		} // end of try
		catch (IOException e) {
			System.out.println("exception = " + e.getMessage());
		} // end catch
		System.exit(0);
	}// End Save
	/**
	 * This method will open whatever file was saved when program runs.
	 */
	@SuppressWarnings("unchecked")
	public void open() {//JW
		// Open file to read from, named SavedObj.sav.
		try {
			FileInputStream fileIn = new FileInputStream("SaveObj.sav");
			// Create an ObjectInputStream to get objects from save file.
			ObjectInputStream in = new ObjectInputStream(fileIn);
			allcontacts = (ArrayList<Contact>) in.readObject();
			in.close(); // This also closes saveFile.
		} catch (IOException e) {
			System.out.println(e.getMessage());// if there was an error, print the info
		} catch (ClassNotFoundException e) {
			// Print the values, to see that they've been recovered.
			System.out.println(e.getMessage());
		}
	}// End of open

}//End of Contact
