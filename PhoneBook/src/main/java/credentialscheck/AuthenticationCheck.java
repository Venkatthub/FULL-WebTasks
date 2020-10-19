package credentialscheck;

import phonebook.directory.UsersDB;

public class AuthenticationCheck {

	public static boolean authenticateUser(String name, String password) {

		if (UsersDB.getUsers().containsKey(name) && UsersDB.getUsers().containsValue(password)) {

			return true;

		} else {

			return false;

		}

	}

	public static boolean authenticateUser(String name) {

		if (UsersDB.getUsers().containsKey(name)) {

			return true;

		} else {

			return false;

		}

	}

}
