package phonebook.directory;

import java.util.ArrayList;
import java.util.List;

import phonebook.Options;

public class PhoneBook implements Options {

	private List<Contacts> contact = new ArrayList<>();

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
	public void editContact(int contactToEdit, String name, String number) {

		contact.get(contactToEdit).setName(name);
		contact.get(contactToEdit).setNumber(number);

	}

	@Override
	public List<Contacts> getContact() {

		return contact;
	}

}
