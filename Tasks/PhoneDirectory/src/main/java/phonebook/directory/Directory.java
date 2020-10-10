package phonebook.directory;

import java.util.*;

import phonebook.Options;

public class Directory implements Options {

	private final static String errorMessage = "Contact Not Found";
	private static Contacts phoneBook;

	public Directory() {
		phoneBook = new Contacts();
	}

//	To add a contact in the phone book
	@Override
	public String addContact(String name, long number) {

		if (number < 100000000000L && number > 1000000000) {

			return "Invalid Number";

		} else if (phoneBook.getContacts().containsKey(name.toLowerCase())) {

			return "Duplicate Entry";

		} else {
			phoneBook.addContact(name.toLowerCase(), number);
			return "Contact Added";
		}

	}

//	To update contact
	@Override
	public String editContact(String name, long number) {

		if (phoneBook.getContacts().containsKey(name.toLowerCase())) {

			phoneBook.addContact(name.toLowerCase(), number);
			return "Update Success";

		}

		return errorMessage;

	}

//	To display a number with given name
	@Override
	public Map<String, Long> displayContact(String name) {

		Map<String, Long> foundContacts = new TreeMap<>();

		for (String contactName : phoneBook.getContacts().keySet()) {

			if (contactName.toLowerCase().contains(name)) {

				foundContacts.put(contactName, phoneBook.getContacts().get(contactName));
			}
		}

		return foundContacts;

	}

//	To view all contacts
	@Override
	public Map<String, Long> displayContact() {

		return phoneBook.getContacts();

	}

//	To delete a contact
	@Override
	public String deleteContact(String name) {

		if (phoneBook.getContacts().containsKey(name.toLowerCase())) {
			phoneBook.removeContact(name);
			return "Deleted";
		}

		return errorMessage;

	}

}
