package login.full;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignIn
 */
@WebServlet(description = "To create a new user", urlPatterns = { "/NewUser", "/SignIn" })
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserCredentials userCredentials;

	@Override
	public void init() throws ServletException {

		userCredentials = new UserCredentials();

	}

	/**
	 * Updating the the username and password whenever a new user
	 * signs in
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("userName");
		String password = req.getParameter("key");
		resp.setContentType("text/html");

		if (userCredentials.addUser(name, password)) {

			resp.getWriter().print("Account Created ! <br> Please Login to continue");
			

//			req.getRequestDispatcher("index.html").forward(req, resp); // Forwarding to index page to make the user
																		// Login

		} else {

			resp.getWriter()
					.print("<div align=\"center\"> UserName or Password already exists! Please try with new one !");

			req.getRequestDispatcher("NewUser.html").include(req, resp); // including the page in this servlet and
																			// getting the control back
			

			resp.getWriter().print("<a href=\"index.html\"><Button>Main Page</Button></a></div>");

		}

	}

}
