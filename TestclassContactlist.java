ln/**
 * This class will read input to act on creating,
 * modifying, printing, saving and starting
 * using the other two classes.*/
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class TestclassContactlist {
	
	public static void main(String[] args) {
	  ContactList all = new ContactList();
		
		Scanner in = new Scanner(System.in);
		while (true ) {
			System.out.println("please select one of the following: \n" +
					  "n - Create new Contact\n" + "p - Print Contact(s)\n" + "r - Search Contact by Last Name\n" + 
					  "q - Quit the program");
		String input= "a"  ;
		input = in.nextLine();
		switch (input.toLowerCase()) {
		case "n": 
			Contact test2 =new Contact();
			test2.readInput();
			all.addContact(test2);
			break;
		case "p": all.sort();
		all.showContactList();
			break;
		case "r": all.searchByLastName();
			break;
		case "q": all.save();
		all.open();
		
			break;
		}//switch
		}//while
	}// end main
	@SuppressWarnings("unchecked")
	public  static void    open()  {
		// Open file to read from, named SavedObj.sav.
		ContactList all;
		try {
			FileInputStream fileIn = new FileInputStream("SaveObj.sav");
			// Create an ObjectInputStream to get objects from save file.
			ObjectInputStream in = new ObjectInputStream(fileIn);
			all = (ContactList) in.readObject();
		} catch (IOException e) {
			System.out.println(e.getMessage());//if there was an error, print the info.
		}catch (ClassNotFoundException e){
		// Print the values, to see that they've been recovered.
		System.out.println(e.getMessage());
		}
		
		
}// End of open
}// end class

/**
 * OUTPUT
 * 
 * Hello, Welcome to the Contact Manager. Please enter the details below to
 * create a new contact. Enter Firstname: Jane Enter Lastname: Doe Enter
 * Streetaddress: 548 Smallhill Lane, San Jose, CA 94025 Enter email:
 * janedoe@gmail.com Enter Phonenumber: 831-768-1049 Enter Notes: Jane helps at
 * the food drive on Wednesdays and Saturdays. Doe, Jane 548 Smallhill Lane, San
 * Jose, CA 94025 janedoe@gmail.com 831-768-1049 Notes:Jane helps at the food
 * drive on Wednesdays and Saturdays. Enter Firstname: Tom Enter Lastname: Jones
 * Enter Streetaddress: 379 Oldforest Court, Oakland, CA 83926 Enter email:
 * tomjones@gmail.com Enter Phonenumber: 408-729-7453 Enter Notes: Tom assists
 * with the food drive on Sundays and Thursdays. Doe, Jane 548 Smallhill Lane,
 * San Jose, CA 94025 janedoe@gmail.com 831-768-1049 Notes:Jane helps at the
 * food drive on Wednesdays and Saturdays. Jones, Tom 379 Oldforest Court,
 * Oakland, CA 83926 tomjones@gmail.com 408-729-7453 Notes:Tom assists with the
 * food drive on Sundays and Thursdays.
 * 
 **/
