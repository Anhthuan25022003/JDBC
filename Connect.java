package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
	public static Connection connect() throws SQLException {
		DriverManager.registerDriver(new org.sqlite.JDBC());
		Connection conect = DriverManager.getConnection("jdbc:sqlite:E:/MYSQL/baitap.db") ;
		return conect;
	
	}
	public static boolean select() throws SQLException  {
		Connection a=Connect.connect();

		Statement st= a.createStatement();
		String sql="SELECT ID,\r\n"
				+ "       Name\r\n"
				+ "  FROM Category;";
		boolean check=st.execute(sql);
		a.close();
		return check;
		

	}
	

}
