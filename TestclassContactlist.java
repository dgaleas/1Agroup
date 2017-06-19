
/**
 * This class will read input to act on creating,
 * modifying, printing, saving and starting
 * using the other two classes
 */
import java.util.Scanner;

public class TestclassContactlist {

	public static void main(String[] args) {

		System.out.println("Hello, Welcome to the Contact Manager.");
		System.out.println("Please enter the details below to create a new contact.");
		Scanner console = new Scanner(System.in);
		
		Contact number1;
		number1 = new Contact();
		number1.readinput();
		ContactList list = new ContactList();
		list.addContact(number1);
		list.showContactList();

		Contact number2;
		number2 = new Contact();
		number2.readinput();
		list.addContact(number2);
		list.showContactList();
	}

}
