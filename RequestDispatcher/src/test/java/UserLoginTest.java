import java.io.IOException;
import java.sql.ParameterMetaData;

import javax.servlet.ServletException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import login.full.UserLogin;

@RunWith(Parameterized.class)
public class UserLoginTest {

	MockHttpServletResponse response;
	UserLogin login;

	@Before
	public void logintest() {
		response = new MockHttpServletResponse();
		login = new UserLogin();
	}

	@Test
	public void test() throws IOException, ServletException {
		// for (String[] arr : userName()) {
		login.doPost(null, response);
		Assert.assertEquals("text/html", response.getContentType());
		Assert.assertEquals("UTF-8", response.getCharacterEncoding());

		// }
	}

	@Parameters
	public String[][] userName() {
		return new String[][] { { "venkat", "1234" }, { "Ram", "5203" } };
	}
}
