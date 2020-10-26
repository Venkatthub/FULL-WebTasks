package phonebook.database;

import java.util.ArrayList;

import phonebook.Options;

public class PhoneBook implements Options {

	private ArrayList<Contacts> contact = new ArrayList<Contacts>();

	@Override
	public void addContact(String name, String number) {

		contact.add(new Contacts(name, number));

	}

	@Override
	public void deleteContact(Contacts contactToDelete) {

		if (contact.contains(contactToDelete)) {

			contact.remove(contactToDelete);
		}

	}

	@Override
	public void editContact(int ContactToEdit, String name, String number) {

		contact.get(ContactToEdit).setName(name);
		contact.get(ContactToEdit).setNumber(number);

	}

	@Override
	public ArrayList<Contacts> getContact() {

		return contact;
	}

}
