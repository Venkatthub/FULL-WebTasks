package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.Entity;
import com.google.cloud.datastore.Query;
import com.google.cloud.datastore.QueryResults;

/**
 * Servlet implementation class DisplayEmployee
 */
@WebServlet("/display")
public class DisplayEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Datastore datastore = DatastoreOptions.newBuilder().build().getService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Query<Entity> query = Query.newEntityQueryBuilder().setKind("Employees").build();

//		String gcQuery = "Select * from Employees";
//
//		Query<?> qry = Query.newGqlQueryBuilder(gcQuery).build();

//		PreparedQuery pq=pre

		QueryResults<Entity> result = datastore.run(query);

		PrintWriter out = resp.getWriter();

		while (result.hasNext()) {

			out.print(result.next());

		}

	}

}
