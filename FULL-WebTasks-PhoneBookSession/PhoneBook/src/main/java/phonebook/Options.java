package phonebook;

import java.util.List;

import phonebook.directory.Contacts;

public interface Options {

	String message = "Invalid Entry";

	void addContact(String name, String number);

	void editContact(int contact, String name, String number);

	void deleteContact(Contacts contact);

	List<Contacts> getContact();

}
