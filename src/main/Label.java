package main;
import java.awt.Font;

import javax.swing.JLabel;

public class Label {

	static Font arial = new Font("Arial", Font.PLAIN, 12);
	static JLabel NAME_APPLI = new JLabel("Manage SQL");
	static JLabel WELCOME_FIRST_MSG = new JLabel("Bienvenue dans Manage SQL");
	static JLabel ERROR_NO_SERVER_DETECTED = new JLabel("Aucun serveur MySQL detecte ! Veuillez verifier que votre connection MySQL est correct ! Si ce probleme perciste veuillez editez vous meme le fichier data/config/config.conf");
	static JLabel FAILED_TO_LOAD_DATABASE = new JLabel("Impossible de charge les base de donnees MySQL");
	static JLabel FAILED_TO_LOAD_APP = new JLabel("Impossible de charger l'application !");
	static JLabel SUCCESS_LOAD_CONFIG = new JLabel("Le fichier de configuration a bien ete charge !");
	static JLabel FAILED_TO_LOAD_FILE_CONFIG = new JLabel("Impossible de charger le fichier de configuration !");
	static JLabel FAILED_TO_LOAD_GRAPHIC_INTERFACE = new JLabel("Probleme d'interface graphique");
	static JLabel DEBUG_LABEL_TEST = new JLabel("Tout est ok !");
	public static JLabel FAILED_QUERY = new JLabel("La requete SQL a echoue :(");

	// INSTALATION
		public static JLabel SUCCESS_FINISH_CONFIG_INSTAL = new JLabel("Configuration fini avec succes ! Veuillez relancer le logiciel");
		public static JLabel CONFIG_APP_MSG = new JLabel("Veuillez configurer Manage SQL");
		public static String HOST_INSTAL_MSG =  "Hote de la base de donnee";
		public static String HOST_INSTAL_MSG_TITLE = "Hote : ( localhost )";
		public static String USER_INSTAL_MSG = "Utilisateur de la base de donnee";
		public static String USER_INSTAL_MSG_TITLE = "Utilisateur : ( root ) ";
		public static String PASS_INSTAL_MSG = "Mot de passe de la base de donnee";
		public static String PASS_INSTAL_MSG_TITLE = "Mot de passe ( ) :";
		public static JLabel ERROR_INPUT_EMPTY = new JLabel("Veuillez relancer l'instalation et remplir les champs correctement ! ");
	}
