import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SQLManager {

	private static Connection Connection;

	public static final boolean setUpConnexion() {
		try {
			Connection = DriverManager.getConnection("jdbc:mysql://"
				+ Config.getDB_HOST() + "/" + "", Config.getDB_USER(),
				Config.getDB_PASS());
			Connection.setAutoCommit(false);
			return true;
		} catch (Exception e) {
			Tool.Alert("Erreur",Label.ERROR_NO_SERVER_DETECTED,2);
			return false;
		}
	}
}