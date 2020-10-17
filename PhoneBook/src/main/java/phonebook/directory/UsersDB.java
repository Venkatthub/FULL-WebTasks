package phonebook.directory;

import java.util.HashMap;

public class UsersDB {

	public static String message;

	private static HashMap<String, String> users = new HashMap<String, String>();
	private static HashMap<String, PhoneBook> usersBook = new HashMap<String, PhoneBook>();

	public static HashMap<String, String> getUsers() {

		return users;

	}

	public static HashMap<String, PhoneBook> getUserPhoneBooks() {

		return usersBook;

	}

	public static void setNewUser(String userName, String userPassword) {

		users.put(userName, userPassword);
		usersBook.put(userName, new PhoneBook());

	}

	public static PhoneBook getInstance(String name) {

		return usersBook.get(name);

	}

}
