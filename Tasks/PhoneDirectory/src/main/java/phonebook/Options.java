package phonebook;

import java.util.Map;

public interface Options {

	boolean addContact(String name, String number);

	boolean editContact(String name, String number);

	boolean deleteContact(String name);

	Map<String, Long> displayContact(String name);

	Map<String, Long> displayContact();

}
