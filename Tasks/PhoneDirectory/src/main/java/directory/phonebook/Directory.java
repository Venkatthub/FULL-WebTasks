package directory.phonebook;

import java.util.*;

import directory.Options;

public class Directory implements Options {

	private static String message = "Contact Not Found";
	private static Contacts phoneBook;

	public Directory() {
		phoneBook = new Contacts();
	}

//	To add a contact in the phone book
	@Override
	public String addContact(String name, String number) {

		if (number.length() > 10) {

			return "Invalid Phone Number";

		} else if (phoneBook.getContacts().containsKey(name.toLowerCase())) {

			return "Duplicate Entry";

		} else {
			phoneBook.addContact(name.toLowerCase(), number);
			return "Contact Added";
		}

	}

//	To update contact
	@Override
	public String editContact(String name, String number) {

		if (phoneBook.getContacts().containsKey(name.toLowerCase())) {

			phoneBook.addContact(name.toLowerCase(), number);
			return "Update Success";

		}

		return message;

	}

//	To display a number with given name
	@Override
	public TreeMap<String, String> displayContact(String name) {

		TreeMap<String, String> foundContacts = new TreeMap<>();

		for (String contactName : phoneBook.getContacts().keySet()) {

			if (contactName.toLowerCase().contains(name)) {

				foundContacts.put(contactName, phoneBook.getContacts().get(contactName));
			}
		}

		return foundContacts;

	}

//	To view all contacts
	@Override
	public Map<String, String> displayContact() {

		return phoneBook.getContacts();

	}

//	To delete a contact
	@Override
	public String deleteContact(String name) {

		if (phoneBook.getContacts().containsKey(name.toLowerCase())) {
			phoneBook.removeContact(name);
			return "Deleted";
		}

		return message;

	}

}
