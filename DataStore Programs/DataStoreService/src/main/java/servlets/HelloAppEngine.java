package servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;

@WebServlet(name = "Datastore", urlPatterns = { "/store" })
public class HelloAppEngine extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");

		response.setCharacterEncoding("UTF-8");

		Entity people = new Entity("Employee", "peoples");

		people.setProperty("Name", request.getParameter("name"));

		people.setProperty("password", request.getParameter("id"));

		DatastoreService store = DatastoreServiceFactory.getDatastoreService();

		store.put(people);

		Key k = people.getKey();

		System.out.println(k);

		Entity p1 = new Entity("Employee", k);

		p1.setProperty("name of the employee", people.getProperty("Name"));

		store.put(p1);

		Entity emp1 = new Entity("Employee", "101", k);

		emp1.setProperty("Email", "venkat.bca0@gmail.com");

	}
}