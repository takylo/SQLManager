package main;
import java.sql.ResultSet;
import java.sql.SQLException;
import instal.Instal;

public class main {

	public static void main(String[] args) {
		LoadingPage loadingPage = new LoadingPage(true);
		if(Instal.CHECK_IS_FIRT_UTILISATION() == false){
			Tool.Alert("Welcome",Label.WELCOME_FIRST_MSG,1);
			Instal.CONFIG_APP_INSTAL();

		}else{
			if(Config.LOAD_CONFIG() == false){
				Tool.Alert("Erreur",Label.FAILED_TO_LOAD_APP,2);
			}else{
				Tool.Alert("Info",Label.SUCCESS_LOAD_CONFIG,1);
				if(SQLManager.setUpConnexion() == false){
					Tool.Alert("Erreur",Label.ERROR_NO_SERVER_DETECTED,2);
					System.exit(0);
				}else{
					try {
						ResultSet SHOW_DATABASE = SQLManager.executeQuery("SHOW DATABASES");
						while( SHOW_DATABASE.next()){
							String allDatabase = SHOW_DATABASE.getString("Database");
							System.out.print(allDatabase+"\n");

						}

					} catch (SQLException e) {
						e.printStackTrace();
						Tool.Alert("Erreur",Label.FAILED_QUERY,2);
					}
					ManageApp app = new ManageApp();
				}
			}
		}
	} 
}
