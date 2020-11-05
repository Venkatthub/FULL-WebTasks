package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

/**
 * Servlet implementation class DisplayEmployee
 */
@WebServlet("/display")
public class DisplayEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		Query query = Query.newEntityQueryBuilder().setKind("Employees").build();

//		String gcQuery = "Select * from Employees";
//
//		Query<?> qry = Query.newGqlQueryBuilder(gcQuery).build();

//		PreparedQuery pq=pre

//		QueryResults<Entity> result = datastore.run(query);
//
//		PrintWriter out = resp.getWriter();
//
//		while (result.hasNext()) {
//
//			out.print(result.next());
//
//		}

//		Key k = KeyFactory.createKey("Employees", 101L);
//
//		try {
//
//			System.out.println(datastore.get(k));
//
//		} catch (EntityNotFoundException e1) {
//
//			e1.printStackTrace();
//		}

		Query query = new Query("Employees");

		PreparedQuery ps = datastore.prepare(query);

		for (Entity e : ps.asIterable()) {

			String name = e.getProperty("Employee Name").toString();
			int id = Integer.valueOf(e.getProperty("Employee ID").toString());
			String mail = e.getProperty("Employee Email ID").toString();
			String dept = e.getProperty("Employee Department").toString();
			String date = e.getProperty("Joining date").toString();

			resp.getWriter().print(name + " " + id + " " + mail + " " + dept + " " + date + "\n");
		}
		

	}

}
