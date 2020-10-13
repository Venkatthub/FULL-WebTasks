package testClasses;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import phonebook.directory.Directory;

@RunWith(Parameterized.class)
public class TestEdit {

	private static Directory direct;
	private String name;
	private String number;
	private boolean expected;

	public TestEdit(String expected, String name, String number) throws Exception {
		this.name = name;
		this.number = number;
		this.expected = Boolean.parseBoolean(expected);
	}

	@Parameters
	public static Collection<String[]> parametersMethod() {
		String arr[][] = { { "true", "venkat", "1234567890" }, { "true", "murali", "7871246686F" } };
		return Arrays.asList(arr);

	}

	@Before
	public void setUp() {
		direct = new Directory();
	}

	@Test
	public void testAddNumber() {
		assertEquals(expected, direct.editContact(name, number));
	}

}
