package phonebook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import phonebook.directory.Directory;

/**
 * Servlet implementation class EditContact
 */
@WebServlet("/edit")
public class EditContact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static Directory book;

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

		PrintWriter out = response.getWriter();

		String name = request.getParameter("cName");
		String number = request.getParameter("cNumber");

		boolean status = book.editContact(name, number);

		if (status) {

			out.print("<br><br><h3 align=\"center\"> Contact Changed</h3><br>");
			out.print("<a href=\"index.jsp\"><Button>HOME</Button></a>");

		} else {

			response.sendError(400, book.Message);

		}

	}

}
