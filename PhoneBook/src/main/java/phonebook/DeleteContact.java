package phonebook;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import phonebook.directory.Contacts;
import phonebook.directory.PhoneBook;
import phonebook.directory.UsersDB;

/**
 * Servlet implementation class DeleteContact
 */
@WebServlet("/delete")
public class DeleteContact extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static int index;

	private static PhoneBook book;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doDelete(request, response);

	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		index = Integer.parseInt(request.getParameter("index"));

		HttpSession session = request.getSession(false);

		String userSession = (String) session.getAttribute("UserName");

		book = UsersDB.getInstance(userSession);

		Contacts contact = book.getContact().get(index);

		book.deleteContact(contact);

		response.sendRedirect("AllContacts.jsp");

	}

}
