package main;
import java.io.BufferedReader;
import java.io.FileReader;


public class Config {

	private static String DB_HOST;
	private static String DB_USER;
	private static String DB_PASS;
	private static final String CONFIG_FILE = "data/config/config.conf";
	static BufferedReader config;

	public static boolean LOAD_CONFIG(){
		
		try {
			config = new BufferedReader(new FileReader(CONFIG_FILE));
			String line = "";
			while ((line=config.readLine())!=null)
			{
				if(line.split("=").length == 1) continue ;
				String param = line.split("=")[0].trim();
				String value = line.split("=")[1].trim();
				if(param.equalsIgnoreCase("DB_HOST"))
				{		
					setDB_HOST(value);
				}else if(param.equalsIgnoreCase("DB_PASS")){
					setDB_PASS(value);
				}else if(param.equalsIgnoreCase("DB_USER")){
					setDB_USER(value);
					return true;
				}
			}
		}catch(Exception e){
			Tool.Alert("Erreur",Label.FAILED_TO_LOAD_FILE_CONFIG,2);
		}
		return false;
	}
	public static void setDB_PASS(String db_PASS){
		DB_PASS = db_PASS;
	}
	public static void setDB_USER(String db_USER){
		DB_USER = db_USER;
	}
	public static void setDB_HOST(String dB_HOST) {
		DB_HOST = dB_HOST;
	}
	public static String getDB_HOST() {
		return DB_HOST;
	}

	public static String getDB_USER(){
		return DB_USER;
	}

	public static String getDB_PASS(){
		return DB_PASS;
	}



}
