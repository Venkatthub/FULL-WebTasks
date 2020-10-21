package sessions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogIn
 */
@WebServlet("/Login")
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("*/*");

		String name = req.getParameter("userName");

		resp.getWriter().print("<h2> Hi " + name + " welcome ! Login Successful !</h2>");

		req.getRequestDispatcher("/Play").forward(req, resp);

	}

}
