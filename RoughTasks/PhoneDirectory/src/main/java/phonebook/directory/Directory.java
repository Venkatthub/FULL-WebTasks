//package phonebook.directory;
//
//import java.util.*;
//
//import phonebook.Options;
//
//public class Directory implements Options {
//
//	public String message;
//	private static String successMessage = "Success";
//	private static String errorMessage_1 = "Invalid Entry";
//	private static String errorMessage_2 = "Duplicate Entry";
//	private static String errorMessage_3 = "Not Found";
//	private static Contacts phoneBook;
//
//	public Directory() {
//		phoneBook = new Contacts();
//	}
//
//	@Override
//	public boolean addContact(String name, String number) {
//
//		if (number.length() < 10 || number.length() > 10) {
//
//			this.message = errorMessage_1;
//			return false;
//
//		} else if (phoneBook.getContacts().containsKey(name.toLowerCase())) {
//
//			this.message = errorMessage_2;
//			return false;
//
//		} else {
//			phoneBook.addContact(name.toLowerCase(), Long.parseLong(number));
//			this.message = successMessage;
//			return true;
//		}
//
//	}
//
//	@Override
//	public boolean editContact(String name, String number) {
//
//		if (number.length() < 10 || number.length() > 10 || number.length() == 0) {
//
//			this.message = errorMessage_1;
//			return false;
//
//		} else if (phoneBook.getContacts().containsKey(name)) {
//
//			phoneBook.addContact(name, Long.parseLong(number));
//			this.message = successMessage;
//			return true;
//
//		}
//
//		this.message = errorMessage_1;
//		return false;
//
//	}
//
//	@Override
//	public TreeMap<String, Long> displayContact(String name) {
//
//		TreeMap<String, Long> foundContacts = new TreeMap<>();
//
//		for (String contactName : phoneBook.getContacts().keySet()) {
//
//			if (contactName.contains(name.toLowerCase())) {
//
//				foundContacts.put(contactName, phoneBook.getContacts().get(contactName));
//
//			}
//		}
//
//		if (foundContacts.isEmpty()) {
//			this.message = errorMessage_3;
//		} else {
//			this.message = successMessage;
//		}
//
//		return foundContacts;
//
//	}
//
//	@Override
//	public Map<String, Long> displayContact() {
//
//		return phoneBook.getContacts();
//
//	}
//
//	@Override
//	public boolean deleteContact(String name) {
//
//		if (name.isEmpty()) {
//			this.message = errorMessage_1;
//		} else if (phoneBook.getContacts().containsKey(name.toLowerCase())) {
//			phoneBook.removeContact(name.toLowerCase());
//			this.message = successMessage;
//			return true;
//		}
//		return false;
//
//	}

//}
