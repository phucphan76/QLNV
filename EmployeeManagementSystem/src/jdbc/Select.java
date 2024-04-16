package jdbc;
import java.sql.*;

import javax.swing.JOptionPane;

import com.mysql.cj.protocol.Resultset;

public class Select {
	public static ResultSet getData(String query){
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = ConnectionProvider.getCon();
			st = con.createStatement();
			rs = st.executeQuery(query);
			return rs;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}
