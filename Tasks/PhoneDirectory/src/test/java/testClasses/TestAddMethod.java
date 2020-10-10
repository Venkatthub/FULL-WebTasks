package testClasses;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import directory.phonebook.Directory;

@RunWith(Parameterized.class)
public class TestAddMethod {

	private static Directory direct;
	private String name;
	private String number;
	private String expected;

	public TestAddMethod(String expected, String name, String number) throws Exception {
		this.name = name;
		this.number = number;
		this.expected = expected;
	}

	@Parameters
	public static Collection<String[]> parametersMethod() {
		String arr[][] = { { "Contact Added", "venkat", "7871246686" }, { "Contact Added", "murali", "8015512560" },
				{ "Contact Added", "bala", "8122174864" } };
		return Arrays.asList(arr);

	}

	@Before
	public void setUp() {
		direct = new Directory();
	}

	@Test
	public void testAddNumber() {
		assertEquals(expected, direct.addContact(name, number));
	}
}
