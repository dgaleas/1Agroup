
/**
 * This class will read input to act on creating,
 * modifying, printing, saving and starting
 * using the other two classes
 */
import java.io.Serializable;
import java.util.Scanner;

//import java.io.IOException;
//import java.io.ObjectOutputStream;
public class TestclassContactlist {

	public static void main(String[] args) {

		System.out.println("Hello, Welcome to the Contact Manager.");
		// System.out.println("You have zero contacts available.");
		System.out.println("Please enter the details below to create a new contact.");
		Scanner console = new Scanner(System.in);
		Contact Jonathan;
		Jonathan = new Contact(null, null, null, null, null, null);
		Jonathan.readinput();
		System.out.println(Jonathan.compareTo(Jonathan));
		System.out.println(Jonathan.toString());
		ContactList list = new ContactList();
		System.out.println(list.checkname());
		System.out.println(list.showcontactlist());
		list.save();
		list.open();
		System.out.println(list.toString());

	}

}
