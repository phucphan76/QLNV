package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	public static Connection getCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mySQL://localhost:3306/qlnv", "root", "");
			return con;
		} catch (Exception e) {
			return null;
		}		
	}
}
