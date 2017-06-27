
/**
 * This class will read input to act on creating,
 * modifying, printing, saving and starting
 * using the other two classes.*/
import java.util.Scanner;
public class TestclassContactlist {
	public static void main(String[] args) {
		ContactList all = new ContactList();
		all.open();
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("Hello, please select");
			String input = "a";
			input = in.nextLine();
			switch (input.toLowerCase()) {//DG
			case "n":
				Contact test2 = new Contact();
				test2.readInput();
				all.addContact(test2);
				break;
			case "p":
				all.sort();
				all.showContactList();
				break;
			case "r":
				all.searchByLastName();
				break;
			case "q":
				all.save();
				break;
			}// switch
		} // while
	}// end main
}// end class
