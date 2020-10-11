package phonebook;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import phonebook.directory.Directory;

@WebServlet(description = "Servlet to Add delete a contact", urlPatterns = { "/add" })
public class AddContact extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static Directory book;

	@Override
	public void init() throws ServletException {

		book = new Directory();

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String number = request.getParameter("number");

		boolean status = book.addContact(name, number);

		if (status) {
			response.sendRedirect("index.jsp");
		} else {

			response.sendError(400, book.Message);
		}
	}

}
