import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Tool {

	public static void Alert(String title,JLabel label,int type){
		switch ( type ){
			case 1:
			JOptionPane.showMessageDialog(null,label,title, JOptionPane.INFORMATION_MESSAGE);
			break;
			case 2:
			JOptionPane.showMessageDialog(null,label,title, JOptionPane.ERROR_MESSAGE);
			break;
			case 3:
			JOptionPane.showMessageDialog(null,label,title, JOptionPane.WARNING_MESSAGE);
			break;
			case 4:
			JOptionPane.showMessageDialog(null,label,title, JOptionPane.PLAIN_MESSAGE);
			break;
			case 5:
			JOptionPane.showMessageDialog(null,label,title, JOptionPane.QUESTION_MESSAGE);
			break;
		}


	}
	public static boolean CHECK_IS_FIRT_UTILISATION(){
		File config = new File("data/config/config.conf");
		if(config.exists()){
			return true;
		}else{
			return false;
		}
	}
            //  une insert ! 1= ok , 0= erreur
			// int newMembre = statement.executeUpdate("INSERT INTO users VALUES (null,'takylo','sebseb')");
			// un select
			// pour recuperer des informations
	public static void ADD_PAUSE(int time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}