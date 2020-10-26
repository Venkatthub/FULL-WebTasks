package credentialscheck;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("userName").toLowerCase();
		String password = req.getParameter("password");

		boolean checkLoginCredentials = AuthenticationCheck.authenticateUser(name, password);

		if (checkLoginCredentials) {

			HttpSession session = req.getSession(true);

			session.setAttribute("UserName", name);

			getServletContext().log("User Logged in ::" + name);

			resp.sendRedirect("/login/home");

		} else {

			resp.sendError(403, "UserName or Password dosen't exist in our system !");

		}

	}
}
