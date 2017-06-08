import java.io.Serializable;
/**
One object of this class represents a list contacts 
 * This class will modify, print, store, and open a contact list
 * including first name, Last name, street address,
 * email, phone number, and notes on contact
 * @author Donaldo
 *
 */

public class ContactList implements Comparable <Contact>{
	 	
 private Contact[] list;
 
 public int compareTo(Contact o){
	return 0;
	 
 }

/**
 * This will show the contact asked for
 * @return 
 * @return
 */
public    String Showcontact(){
	return "";
}//End of Showcontact
/**THis Method will return 
 * all contacts that match the last name inputed 
 * by user
 * @return
 */

public String  Checkname() {
	return "";
}//End Checkname
/**
 * This method will save contact list to a file
 * on hard disk
 */
public void save(){
	
}//End Save
/**
 * This method will open whatever file was saved when asked by user
 */

public void open(){
	
}//End of open


}//End of class
