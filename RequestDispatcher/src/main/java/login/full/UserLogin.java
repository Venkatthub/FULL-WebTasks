package login.full;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserLogin
 */
@WebServlet(description = "Checks login credentials and shifts the control back", urlPatterns = { "/Login" })
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserCredentials userCredentials;

	@Override
	public void init() throws ServletException {

		userCredentials = new UserCredentials();

	}

	/**
	 * Validating the user credentials
	 */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		String name = request.getParameter("userName");
		String password = request.getParameter("key");

		PrintWriter out = response.getWriter();

		if (userCredentials.getUserCredentials().containsKey(name)
				&& userCredentials.getUserCredentials().containsValue(password)) {

			request.getRequestDispatcher("/show").forward(request, response);
			
		} else {
			out.println("Invalid Credentials");
			request.getRequestDispatcher("index.html").forward(request, response); // To forward the control to the
																					// previous page
		}

	}

}
