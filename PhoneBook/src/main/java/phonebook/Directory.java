package phonebook;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.Contacts;

/**
 * Servlet implementation class Directory
 */
@WebServlet(description = "To perform all operations", urlPatterns = { "/Directory" })
public class Directory extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static int index;
	private static String name;
	private static String number;
	private static Options book;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		book = (Options) request.getServletContext().getAttribute("option");

		String operation = request.getParameter("function");
		if (operation.contains("add")) {

			name = request.getParameter("name").toLowerCase();
			number = request.getParameter("number");

			if (name.isEmpty() || number.isEmpty() || number.length() > 10 || number.length() < 10) {

				response.sendError(404, Options.message);

			} else {

				book.addContact(name, number);
				response.sendRedirect("index.jsp");

			}

		} else if (operation.contains("delete")) {

			index = Integer.parseInt(request.getParameter("index"));
			Contacts contact = book.getContact().get(index);
			book.deleteContact(contact);
			response.sendRedirect("AllContacts.jsp");

		} else if (operation.contains("edit")) {

			index = Integer.parseInt(request.getParameter("index"));
			name = (String) request.getParameter("name");
			number = (String) request.getParameter("number");

			if (name.isEmpty() || number.isEmpty() || number.length() > 10 || number.length() < 10) {

				response.sendError(404, Options.message);

			} else {

				book.editContact(index, name, number);

				response.sendRedirect("AllContacts.jsp");
			}

		}

	}

}
