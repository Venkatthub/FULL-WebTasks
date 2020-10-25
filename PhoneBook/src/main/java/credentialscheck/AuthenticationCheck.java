package credentialscheck;

import database.UsersDB;

public class AuthenticationCheck {

	public static boolean authenticateUser(String name, String password) {

		return UsersDB.getUsers().containsKey(name) && UsersDB.getUsers().containsValue(password);

	}

	public static boolean authenticateUser(String name) {

		return UsersDB.getUsers().containsKey(name);

	}

}
