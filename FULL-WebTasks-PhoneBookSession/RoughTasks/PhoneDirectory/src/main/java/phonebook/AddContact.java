package phonebook;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import phonebook.directory.Direct;

@WebServlet(description = "Servlet to Add delete a contact", urlPatterns = { "/add" })
public class AddContact extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Direct dir = (Direct) request.getAttribute("Directory");

		String name = request.getParameter("name").toLowerCase().strip();
		String number = request.getParameter("number").strip();

		if (name.isEmpty() || number.isEmpty()) {

			response.sendError(404, dir.message);

		} else {

			dir.addContact(name, number);
			response.sendRedirect("index.jsp");

		}

	}

}
