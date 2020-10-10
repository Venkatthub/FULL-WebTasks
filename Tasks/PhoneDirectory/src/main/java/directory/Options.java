package directory;

import java.util.Map;

public interface Options {

	String addContact(String name, long number);

	String editContact(String name, long number);

	String deleteContact(String name);

	Map<String, Long> displayContact(String name);

	Map<String, Long> displayContact();

}
