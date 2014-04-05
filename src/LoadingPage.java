import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


public class LoadingPage {
	public LoadingPage(boolean is_visible){

		JFrame loadingPage = new JFrame();
		loadingPage.setSize(500,400);
		loadingPage.setResizable(false);
		loadingPage.setUndecorated(true);
		loadingPage.add(Load.LOGO_APP);
		loadingPage.setLocationRelativeTo(null);
		if(is_visible == true){
		loadingPage.setVisible(true); 			
	    }else{
	    loadingPage.setVisible(false);
	    }


		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(loadingPage);
		} catch (Exception e) {
			Tool.Alert("Erreur",Label.FAILED_TO_LOAD_GRAPHIC_INTERFACE,2);
		}
	}
} 
