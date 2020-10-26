package servlets;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.cloud.Date;

public class DatastoreServiceClass {

	private Entity emp;

	private static Long entityId = 101L;

	public void addEmp(String name, int id, String department, String mail) {

		emp = new Entity("Employees", entityId);

		emp.setProperty("Employee Name", name);

		emp.setProperty("Employee ID", id);

		emp.setProperty("Employee Department", department);

		emp.setProperty("Employee Email ID", mail);

		emp.setProperty("Joining date", "now");

		DatastoreService store = DatastoreServiceFactory.getDatastoreService();

		store.put(emp);

		entityId++;

	}

}
