package phonebook;

import java.util.List;

import phonebook.database.Contacts;

public interface Options {

	String message = "Invalid Entry";

	void addContact(String name, String number);

	void editContact(int contact, String name, String number);

	void deleteContact(Contacts contact);

	List<Contacts> getContact();

}
