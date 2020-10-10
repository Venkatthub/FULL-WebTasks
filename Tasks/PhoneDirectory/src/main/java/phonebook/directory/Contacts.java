package phonebook.directory;

import java.util.*;

public class Contacts {

	private static TreeMap<String, Long> book = new TreeMap<>();

//	To add contact to the collection
	public void addContact(String name, long number) {

		book.put(name, number);
	}

//	To return the collection
	public Map<String, Long> getContacts() {
		return book;
	}

//	To delete a contact
	public void removeContact(String name) {

		book.remove(name);

	}

}
