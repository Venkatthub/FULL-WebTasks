package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmloyeeDataStore
 */
@WebServlet("/stored")
public class EmloyeeDataStore extends HttpServlet {

	private static final long serialVersionUID = 1L;

	DatastoreServiceClass ds;

	@Override
	public void init() throws ServletException {

		ds = new DatastoreServiceClass();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		response.getWriter().print();

		ds.addEmp(request.getParameter("name"), Integer.parseInt(request.getParameter("id")),
				request.getParameter("dept"), request.getParameter("mail"));

		response.sendRedirect("/");

	}

}
