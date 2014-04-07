package instal;

import java.io.File;
import main.Tool;
import main.Label;
import javax.swing.JOptionPane;

public class Instal {
	public static boolean CHECK_IS_FIRT_UTILISATION(){
		File config = new File("data/config/config.conf");
		if(config.exists()){
			return true;
		}else{
			return false;
		}
	}
	public static void CONFIG_APP_INSTAL(){
		JOptionPane configuration = new JOptionPane();
		Tool.Alert("configuration",Label.CONFIG_APP_MSG,1);
		String host = configuration.showInputDialog(null,Label.HOST_INSTAL_MSG_TITLE,Label.HOST_INSTAL_MSG, JOptionPane.QUESTION_MESSAGE);
		String user = configuration.showInputDialog(null, Label.USER_INSTAL_MSG_TITLE,Label.USER_INSTAL_MSG, JOptionPane.QUESTION_MESSAGE);	
		String pass = configuration.showInputDialog(null,Label.PASS_INSTAL_MSG_TITLE,Label.PASS_INSTAL_MSG, JOptionPane.QUESTION_MESSAGE);
		if(host.isEmpty() || user.isEmpty()){
			Tool.Alert("Erreur",Label.ERROR_INPUT_EMPTY,2);
			System.exit(0);
		}else{
			Tool.Alert("Finish ! ",Label.SUCCESS_FINISH_CONFIG_INSTAL,1);
			String CONFIG_TEXT = " DB_HOST = "+host+" \n DB_USER = "+user+" \n DB_PASS = "+pass+"";
			Tool.WriteFile("config/config.conf",CONFIG_TEXT);
			System.exit(0);
		}
	}
}
