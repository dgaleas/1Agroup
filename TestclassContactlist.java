
/**
 * This class will read input to act on creating,
 * modifying, printing, saving and starting
 * using the other two classes
 * @author Donaldo
 */
import java.io.Serializable;
import java.util.Scanner;
import java.io.IOException;

public class TestclassContactlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact Jonathan;
		Jonathan = new Contact();
		Jonathan.readinput();
		System.out.println(Jonathan.compareTo(Jonathan));
		System.out.println(Jonathan.toString());
		ContactList list = new ContactList();
		System.out.println(list.checkname());
		System.out.println(list.showcontactlist());
		list.save();
		list.open();
		System.out.println(list.toString());

	}// End Main

}// End class
/*
 * 
 * 0 tosString() works checkname() works showcontactlist() works toString()
 * works
 */