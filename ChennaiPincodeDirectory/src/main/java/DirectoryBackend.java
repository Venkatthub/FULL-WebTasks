import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Directory", urlPatterns = { "/backend" })

public class DirectoryBackend extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String userInput = req.getParameter("area");

		CityCodes codes = new CityCodes();

		for (String areaname : codes.chennaiCodes().keySet()) {

			if (areaname.contains(userInput)) {

				userInput = areaname;
				break;
			}
		}

		if (codes.chennaiCodes().containsKey(userInput)) {

			int code = codes.chennaiCodes().get(userInput);

			out.print("<html><br>" + codes + (codes.code + code) + "<br>" + "Area :" + userInput.toUpperCase());

		} else {

			int value = Integer.parseInt(userInput);

			if (codes.chennaiCodes().containsValue(value)) {

				out.print("<br>" + codes + (codes.code + value) + "<br>" + "Area :");

				codes.chennaiCodes().keySet().stream().forEach(x -> {
					if (codes.chennaiCodes().get(x) == value)
						out.print("<br>" + x.toUpperCase() + "</html>");
				});

			} else {

				throw new NotFound("\nEntered code or area name is incorrect ! \nPlease try again ");

			}
		}

	}

}
