package phonebook;

import java.util.List;

import phonebook.directory.Contacts;

public interface Options {

	void addContact(String name, String number);

	boolean editContact(Contacts contact, String name, String number);

	boolean deleteContact(Contacts contact);

	List<Contacts> getContact();

}
