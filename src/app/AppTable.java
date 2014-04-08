package app;

import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JPanel;

import main.Label;
import main.SQLManager;
import main.Tool;

public class AppTable {

	private static JPanel _AppTable = new JPanel();
	private static String _bddSelected = AppBdd.getDatabaseUsed();
	public static Component AppTable(){
		if(AppBdd.getDatabaseIsSelected() == "yes"){
				SQLManager.setUpConnexion(_bddSelected);
		try {
			ResultSet SHOW_TABLE = SQLManager.executeQuery("SELECT * FROM "+_bddSelected+".tables");
			while(SHOW_TABLE.next()){
				 String allDatabase = SHOW_TABLE.getString("table");
				 System.out.print(SHOW_TABLE);
				 System.out.print(allDatabase);
			}
		} catch (SQLException e) {
			Tool.Alert("Erreur",Label.FAILED_QUERY,2);
			e.printStackTrace();
		}
	}else{}
		return _AppTable;

	}
}
