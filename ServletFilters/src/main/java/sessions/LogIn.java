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

	public void init() throws ServletException {

		System.out.println("Init method is called !");
	}

	@Override

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("userName");

		resp.getWriter().print(" Hi " + name + " welcome ! Login Successful !");

		resp.flushBuffer();

		req.getRequestDispatcher("/Login/Play").forward(req, resp);

	}

	@Override
	public void destroy() {

		System.out.println("Destroy method !");

	}

}
