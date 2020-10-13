package phonebook.directory;

import java.util.ArrayList;

import phonebook.Options;

public class Direct implements Options {

	private static ArrayList<Contacts> contact = new ArrayList<Contacts>();
	public String message = "Invalid Entry";
//	private static String errorMessage_1 = "Invalid Entry";
//	private static String errorMessage_2 = "Duplicate Entry";
//	private static String errorMessage_3 = "Not Found";

	@Override
	public void addContact(String name, String number) {

		contact.add(new Contacts(name, number));

	}

	@Override
	public boolean deleteContact(Contacts contactToDelete) {

		if (contact.contains(contactToDelete)) {

			for (Contacts con : contact) {

				if (con.equals(contactToDelete)) {
					con = null;
					return true;
				}

			}
		}
		return false;

	}

	@Override
	public boolean editContact(Contacts ContactToEdit, String name, String number) {

		if (contact.contains(ContactToEdit)) {
			ContactToEdit.setName(name);
			ContactToEdit.setNumber(number);
			return true;
		}
		return false;

	}

	@Override
	public ArrayList<Contacts> getContact() {

		return contact;
	}

}
