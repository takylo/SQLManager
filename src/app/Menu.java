package app;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Menu {
      
      /* Le menu du logiciel */

      private static JMenuBar appMenu = new JMenuBar();
      private static JMenu _help = new JMenu("Help");
      private static JMenu _github = new JMenu("Suivre le projet");
      private static JMenu _config = new JMenu("Configuration");
      
	public static JMenuBar Menu() {
		appMenu.add(_config);appMenu.add(_github);appMenu.add(_help); // on ajoute les item au menu
		return appMenu;

	}

}
