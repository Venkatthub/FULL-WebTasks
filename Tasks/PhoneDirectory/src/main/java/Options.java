

import java.util.Map;

public interface Options {

	String addNumber(String name, String number);
	
	String editNumber(String name, String number);
	
	String deleteNumber(String name);
	
	String displayNumber(String name);
	
	Map<String, String> displayContacts();
	
}
