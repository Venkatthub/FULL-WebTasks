package sessions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PlayVideo
 */
<<<<<<< HEAD
@WebServlet("/Play")
=======
@WebServlet("/Login/Play")
>>>>>>> PhoneBookSession
public class PlayVideo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

<<<<<<< HEAD
=======
		resp.setContentType("text/html");
>>>>>>> PhoneBookSession
		resp.getWriter().print(
				"<div align=\"center\"><iframe width=\"1519\" height=\"562\" src=\"https://www.youtube.com/embed/FE6s4tUaLXQ\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe></div>");

	}

}
