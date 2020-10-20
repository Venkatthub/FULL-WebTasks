package phonebook.directory;

import java.util.HashMap;
import java.util.Map;

public class UsersDB {

	private static Map<String, String> users = new HashMap<>();
	private static Map<String, PhoneBook> usersPhoneBook = new HashMap<>();

	public static Map<String, String> getUsers() {

		return users;

	}

	public static Map<String, PhoneBook> getUserPhoneBooks() {

		return usersPhoneBook;

	}

	public static void setNewUser(String userName, String userPassword) {

		users.put(userName, userPassword);
		usersPhoneBook.put(userName, new PhoneBook());

	}

	public static PhoneBook getInstance(String name) {

		return usersPhoneBook.get(name);

	}

}
