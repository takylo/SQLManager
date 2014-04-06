package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLManager {

	private static Connection Connection;

	public static final boolean setUpConnexion() {
		try {

			String url = "jdbc:mysql://"+Config.getDB_HOST()+":3306/";
			String user = Config.getDB_USER();
			String passwd = Config.getDB_PASS();
			Connection = DriverManager.getConnection(url,user,passwd);
			// Connection.setAutoCommit(false);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public static ResultSet executeQuery(String query) throws SQLException {

		Connection DB;
		DB = Connection;

		Statement stat = DB.createStatement();
		ResultSet RS = stat.executeQuery(query);
		// stat.setQueryTimeout(300);
		return RS;
	}
}