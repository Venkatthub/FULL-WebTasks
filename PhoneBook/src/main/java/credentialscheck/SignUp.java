package credentialscheck;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import phonebook.directory.UsersDB;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/CreateAccount")
public class SignUp extends HttpServlet {

	private static final long serialVersionUID = 1L;
	DisplayMessageThread thread;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("userName").toLowerCase();
		String password = req.getParameter("password");

		boolean userNameCheck = AuthenticationCheck.authenticateUser(name, password);

		if (userNameCheck) {

			resp.setStatus(204);

			resp.getWriter().println("User Name already taken. please enter a new one");

			thread = new DisplayMessageThread();

			thread.start();

			req.getRequestDispatcher("SignUp.jsp").forward(req, resp);

		} else {

			if (name.isEmpty() || password.isEmpty() || name == "" || password == "") {

				resp.sendError(400, "Invalid Entry");

			} else {

				UsersDB.setNewUser(name, password);

				resp.getWriter().println("Account Created ! Please login to continue");

				thread = new DisplayMessageThread();

				thread.start();

				resp.sendRedirect("index.jsp");

			}

		}

	}
}
