package phonebook;

import java.util.*;

public class DirectoryBook {

	private static HashMap<String, String> book = new HashMap<>();

//	To add contact to the collection
	public void addContact(String name, String number) {

		book.put(name, number);
	}

//	To return the collection
	public Map<String, String> getContacts() {
		return book;
	}

//	To delete a contact
	public void removeContact(String name) {

		book.remove(name);

	}

}
