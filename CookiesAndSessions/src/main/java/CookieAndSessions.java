
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CookieAndSessions
 */
@WebServlet("/Login")
public class CookieAndSessions extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = "venkat";

		Cookie c = new Cookie("UserName", name);

		c.setMaxAge(60 * 2);

		c.setHttpOnly(true);

		c.setSecure(true);

		resp.addCookie(c);

	}

}
