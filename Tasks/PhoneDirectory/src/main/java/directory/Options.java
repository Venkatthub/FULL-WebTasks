package directory;

import java.util.Map;

public interface Options {

	String addContact(String name, String number);

	String editContact(String name, String number);

	String deleteContact(String name);

	Map<String, String> displayContact(String name);

	Map<String, String> displayContact();

}
