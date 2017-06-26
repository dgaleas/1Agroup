
/**
 * This class will read input to act on creating,
 * modifying, printing, saving and starting
 * using the other two classes.
 */
import java.util.Scanner;

public class TestclassContactlist {

	public static void main(String[] args) {

		System.out.println("Hello, Welcome to the Contact Manager.");
		Scanner console = new Scanner(System.in);

		Contact number1;
		number1 = new Contact();
		number1.readInput();
		ContactList list = new ContactList();
		list.addContact(number1);
		

		Contact number2;
		number2 = new Contact();
		number2.setLastname("Jensen");
		list.addContact(number2);
		list.searchByLastName();
		
	}//end main

}//end class

/**
 * OUTPUT
 * 
Hello, Welcome to the Contact Manager.
Please enter the details below to create a new contact.
Enter Firstname: 
Jane
Enter Lastname: 
Doe
Enter Streetaddress: 
548 Smallhill Lane, San Jose, CA 94025
Enter email: 
janedoe@gmail.com
Enter Phonenumber: 
831-768-1049
Enter Notes: 
Jane helps at the food drive on Wednesdays and Saturdays.
Doe, Jane
548 Smallhill Lane, San Jose, CA 94025
janedoe@gmail.com
831-768-1049
Notes:Jane helps at the food drive on Wednesdays and Saturdays.
Enter Firstname: 
Tom
Enter Lastname: 
Jones
Enter Streetaddress: 
379 Oldforest Court, Oakland, CA 83926
Enter email: 
tomjones@gmail.com
Enter Phonenumber: 
408-729-7453
Enter Notes: 
Tom assists with the food drive on Sundays and Thursdays.
Doe, Jane
548 Smallhill Lane, San Jose, CA 94025
janedoe@gmail.com
831-768-1049
Notes:Jane helps at the food drive on Wednesdays and Saturdays.
Jones, Tom
379 Oldforest Court, Oakland, CA 83926
tomjones@gmail.com
408-729-7453
Notes:Tom assists with the food drive on Sundays and Thursdays.

**/ 
