
/**
 *An object of this class is a contact containing info on ONE person, including
 * first name, last name, street address, phone number, and notes
 * 
 * @author Donaldo
 *
 */
public class Contact implements Comparable<Contact> {
	private String firstname;
	private String lastname;
	private String streetaddress;
	private String email;
	private int phonenumber;
	private String notes;

	/**
	 * This will read input from user and create an object containing contact
	 * info. This will include a first name, last name, street address,
	 * email, phone number, and notes about the person.
	 * @return
	 */

	public void readinput() {

	}// End readinput

	/**
	 * This method will return the object of this class as a string.
	 */
	public String toString() {
		return "toString() works";

	}// End of toString

	/**
	 * This method will compare the object contact to another that is received
	 * from the user.
	 */

	public int compareTo(Contact o) {
		return 0;

	}

}// End class
