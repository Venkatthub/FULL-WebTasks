package login.full;

import java.util.*;

public class UserCredentials {

	private static HashMap<String, String> userCredentials = new HashMap<String, String>();

	// Adding user to the map
	public boolean addUser(String userName, String password) {

		if (userCredentials.containsKey(userName) || userCredentials.containsValue(password)) {
			return false;
		} else {

			userCredentials.put(userName, password);
			return true;
		}
	}

//	To get the collection
	public HashMap<String, String> getUserCredentials() {

		return userCredentials;

	}

}
