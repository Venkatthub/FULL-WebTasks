package phonebook;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import phonebook.directory.PhoneBook;
import phonebook.directory.UsersDB;

/**
 * Servlet implementation class AddContact
 */
@WebServlet("/AddContact")
public class AddContact extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static String name;

	private static String number;

	private static PhoneBook book;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		name = request.getParameter("name").toLowerCase();

		number = request.getParameter("number");

		HttpSession session = request.getSession(false);

		String userSession = (String) session.getAttribute("UserName");

		book = UsersDB.getInstance(userSession);

		if (number.length() > 10 || number.length() < 10 || name.isEmpty() || number.isEmpty()) {

			response.sendError(404, Options.MESSAGE);

		} else {

			book.addContact(name, number);
			response.sendRedirect("HomePage.jsp");

		}

	}
}
