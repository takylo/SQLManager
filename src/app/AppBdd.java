package app;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Label;
import main.SQLManager;
import main.Tool;

public class AppBdd {

	public static JPanel _AppBdd = new JPanel(); 
	private static String DB_USED;
	public static String IS_SELECTED;
	public static Component AppBdd(){
		try {
			ResultSet SHOW_DATABASE = SQLManager.executeQuery("SHOW DATABASES");
			int nbDb = 0;
			while(SHOW_DATABASE.next()){
				nbDb++;
				String allDatabase = SHOW_DATABASE.getString("Database");
				_AppBdd.setBackground(new Color(255,255,255));
				_AppBdd.setLayout(new GridLayout(nbDb,2));
				final JLabel _Database = new JLabel(allDatabase + "\n");
				_AppBdd.add(_Database);

				_Database.addMouseListener(new MouseAdapter()  
				{  
					public void mouseReleased(MouseEvent e)  
					{   
						setDatabaseIsSelected("yes");
					
						System.out.print("Debug : "+_Database.getText());
						setDatabaseUsed(_Database.getText());
					}  
				});  
			}
		} catch (SQLException e) {
			e.printStackTrace();
			Tool.Alert("Erreur",Label.FAILED_QUERY,2);
		}
		return _AppBdd;
	}
	public static  void setDatabaseUsed(String db){
		DB_USED = db;
	}
	public static  String getDatabaseUsed(){
		return DB_USED;
	}
	public static void setDatabaseIsSelected(String p){
		IS_SELECTED = p;
	}
	public static  String getDatabaseIsSelected(){
		return IS_SELECTED;
	}
}
