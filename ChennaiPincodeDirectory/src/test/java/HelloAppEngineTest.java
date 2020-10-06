import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class HelloAppEngineTest {

	@Test
	public void test() throws IOException {
		MockHttpServletResponse response = new MockHttpServletResponse();
		Assert.assertEquals("text/html", response.getContentType());
		Assert.assertEquals("UTF-8", response.getCharacterEncoding());
	}
}
