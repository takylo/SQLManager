import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Connection;


public class Database {

	
	private String _url = "jdbc:mysql://"+Config.getDB_HOST()+":3306/";
	private String _user = Config.getDB_USER();
	private String _passwd = Config.getDB_PASS();
	private static java.sql.Connection connect;

	private Database(){
		try {
			connect = DriverManager.getConnection(_url, _user, _passwd);
			Statement query = connect.createStatement();
		} catch (Exception e) {
			Tool.Alert("Erreur",Label.ERROR_NO_SERVER_DETECTED,2);
		}
	} 

}
