import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloAppEngine", urlPatterns = { "/hellofulluser" })
public class HelloAppEngine extends HttpServlet {


	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		System.out.print(request);
		response.getWriter().print(request);
		response.getWriter().print("Hello App Engine!\r\n");
		System.out.println(response);

	}
}