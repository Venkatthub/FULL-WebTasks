package phonebook.directory;

public class Contacts {

	private String name;
	private String number;

	public Contacts(String name, String number) {

		this.name = name;
		this.number = number;

	}

	public void setName(String name) {

		this.name = name;
	}

	public void setNumber(String number) {

		this.number = number;
	}

	public String getName() {

		return name;
	}

	public String getNumber() {

		return number;
	}

	@Override
	public String toString() {

		return this.name + " " + this.number;
	}

}
