package jdbc;
import java.sql.*;

import javax.swing.JOptionPane;

public class tables {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			con = ConnectionProvider.getCon();
			st = con.createStatement();
//			st.executeUpdate("create table experience(id varchar(20), fullname varchar(50), birthday varchar(50), phone int, email varchar(50), type varchar(50), expinyear smallint, proskill varchar(100))");
//			st.executeUpdate("create table fresher(id varchar(20), fullname varchar(50), birthday varchar(50), phone int, email varchar(50), type varchar(50), graduationdate varchar(50), graduationrank varchar(10), education varchar(50))");
//			st.executeUpdate("create table intern(id varchar(20), fullname varchar(50), birthday varchar(50), phone int, email varchar(50), type varchar(50), majors varchar(50), semester smallint, universityname varchar(50))");
			JOptionPane.showMessageDialog(null, "Tables Create Successfully");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);	
		} finally {
			try {
				con.close();
				st.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
