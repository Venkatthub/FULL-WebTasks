package filters;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class AuthorizationToVideo
 */

<<<<<<< HEAD
@WebFilter(filterName = "Authorization", dispatcherTypes = { DispatcherType.INCLUDE })
=======
@WebFilter(filterName = "Authorization", dispatcherTypes = { DispatcherType.FORWARD })
>>>>>>> PhoneBookSession
public class AuthorizationToVideo implements Filter {

	String user = "venkat";
	String password = "admin";

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;

		String name = req.getParameter("userName");
		String passkey = req.getParameter("key");

		if (name.equalsIgnoreCase(user) && passkey.equalsIgnoreCase(password)) {

			chain.doFilter(request, response);

		} else {

			resp.getWriter().print("You are not authorized to view this video !");
			resp.getWriter().print("<a href=\"index.html\">Home</a>");

		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
