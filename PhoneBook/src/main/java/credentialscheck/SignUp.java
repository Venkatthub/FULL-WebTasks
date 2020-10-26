package credentialscheck;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import phonebook.database.UsersDB;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/signup/CreateAccount")
public class SignUp extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("userName").toLowerCase();
		String password = req.getParameter("password");

		boolean userNameCheck = AuthenticationCheck.authenticateUser(name);

		if (userNameCheck) {

			resp.setStatus(403);

			resp.getWriter().println("<div align=\"center\">User Name already taken. please enter a new one</div>");

			req.getRequestDispatcher("/SignUp.jsp").include(req, resp);

		} else {

			UsersDB.setNewUser(name, password);

			resp.getWriter().println("<div align=\"center\">Account Created ! Please login to continue</div>");

			getServletContext().log("A new user added ::" + name);

			resp.getWriter().println("<a href=\"\\\">Login</a>");

		}

	}

}
