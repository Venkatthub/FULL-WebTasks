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
 * Servlet implementation class EditContact
 */
@WebServlet("/edit")
public class EditContact extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static int index;

	private static String name;

	private static String number;

	private static PhoneBook book;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPut(request, response);

	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		index = Integer.parseInt(request.getParameter("index"));

		name = (String) request.getParameter("name");

		number = (String) request.getParameter("number");

		HttpSession session = request.getSession(false);

		String userSession = (String) session.getAttribute("UserName");

		book = UsersDB.getInstance(userSession);

		if (name.isEmpty() || number.isEmpty() || number.length() > 10 || number.length() < 10) {

			response.sendError(404, Options.MESSAGE);

		} else {

			book.editContact(index, name, number);

			response.sendRedirect("AllContacts.jsp");

		}

	}

}
