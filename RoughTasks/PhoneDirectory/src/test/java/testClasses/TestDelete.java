package testClasses;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import phonebook.directory.Directory;

@RunWith(Parameterized.class)
public class TestDelete {
	private static Directory direct;
	private String name;
	private boolean expected;

	public TestDelete(String expected, String name) throws Exception {
		this.name = name;
		this.expected = Boolean.parseBoolean(expected);
	}

	@Parameters
	public static Collection<String[]> parametersMethod() {
		String arr[][] = { { "true", "venkat" }, { "true", "murali" }, { "true", "bala" } };
		return Arrays.asList(arr);

	}

	@Before
	public void setUp() {
		direct = new Directory();
	}

	@Test
	public void testDeleteNumber() {
		Assert.assertEquals(expected, direct.deleteContact(name));
	}
}
