package phonebook;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import phonebook.directory.Directory;

/**
 * Servlet implementation class DeleteContact
 */
@WebServlet(description = "Servlet to delete a contact", urlPatterns = { "/delete" })
public class DeleteContact extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static Directory book;

	/**
	 * @see Servlet#init()
	 */
	@Override
	public void init() throws ServletException {
		book = new Directory();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");

		boolean status = book.deleteContact(name);

		if (status) {
			response.sendRedirect("index.jsp");
		} else {

			response.sendError(400, book.Message);

		}

	}

}
