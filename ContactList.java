/**
 * One object of this class represents a list contacts This class will modify,
 * print, store, and open a contact list including first name, Last name, street
 * address, email, phone number, and notes on contact.
 */
import java.util.ArrayList;
import java.io.*;

public class ContactList implements Serializable {
	private ArrayList<Contact> allcontacts = new ArrayList<Contact>();
	public void addContact(Contact con) {
		allcontacts.add(con);
	}// end addcontact
	
	/**
	 * This will print entire list of contacts to console.
	 * 
	 * @return
	 */
	public void showContactList() {
		for (int i = 0; allcontacts.size() > i; i++) {
			
			System.out.println("Contact Details "+ "\n" + allcontacts.get(i).toString());
		}
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
	public  void save()  {
		//ArrayList<Contact> allcontacts = new ArrayList <Contact>();
		System.out.println("save method");
		try { //Catch errors in I/O if necessary.
			FileOutputStream saveFile = new FileOutputStream("SaveObj.sav");//Open a file to write to, named SavedObj.sav.
			ObjectOutputStream save = new ObjectOutputStream(saveFile);// Create an ObjectOutputStream to put objects into save file.
			save.writeObject(allcontacts);//  Writes and saves the contacts to the file
			save.close();//closes the file and also saveFile.
			System.out.println("done writing");
		}// end of try
		catch (IOException e) {
			System.out.println("exception = " + e.getMessage());
		}// end catch
		

	}// End Save

	/**
	 * This method will open whatever file was saved when program runs.
	 */

	@SuppressWarnings("unchecked")
	public   void open()  {
		// Open file to read from, named SavedObj.sav.
		ArrayList<Contact> allcontacts;
		try {
			FileInputStream fileIn = new FileInputStream("SaveObj.sav");
			// Create an ObjectInputStream to get objects from save file.
			ObjectInputStream in = new ObjectInputStream(fileIn);
			allcontacts = (ArrayList <Contact>) in.readObject();
			System.out.println(allcontacts);
			in.close(); // This also closes saveFile.
		} catch (IOException e) {
			System.out.println(e.getMessage());//if there was an error, print the info.
		}catch (ClassNotFoundException e){
		// Print the values, to see that they've been recovered.
		System.out.println(e.getMessage());
		}
	}// End of open
	}
	

