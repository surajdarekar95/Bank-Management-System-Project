package bankManagementSystem;

import java.sql.*;

public class Conn {

	// Five steps required to connect JDBC driver
	/*
	 * 	1.Register the driver
	 *  2.Create connection 
	 *  3.Create statement 
	 *  4.Execute query
	 * 	5.Close Connection
	 */

	Connection c;
	Statement squery;

	public Conn() {

		try {

			c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Darekar@Mysql");
			squery = c.createStatement();

		} catch (Exception e) {

			System.out.println(e);
		}
	}

}
