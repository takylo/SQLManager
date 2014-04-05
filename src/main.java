
public class main {

	public static void main(String[] args) {
		LoadingPage loadingPage = new LoadingPage(true);
		if(Tool.CHECK_IS_FIRT_UTILISATION() == false){
			Tool.Alert("Welcome",Label.WELCOME_FIRST_MSG,1);
		}else{
			if(Config.LOAD_CONFIG() == false){
				Tool.Alert("Erreur",Label.FAILED_TO_LOAD_APP,2);
			}else{
				Tool.Alert("Info",Label.SUCCESS_LOAD_CONFIG,1);
				if(SQLManager.setUpConnexion() == false ){
					Tool.Alert("Erreur",Label.ERROR_NO_SERVER_DETECTED,2);
					System.exit(0);
				}else{
					ManageApp app = new ManageApp();
				}
			}
		}
	} 
}
