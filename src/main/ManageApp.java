package main;
import javax.swing.JFrame;

import app.Menu;
import app.ToolBox;

public class ManageApp {
	public ManageApp(){
		JFrame _frame = new JFrame();
        // ToolBox _ToolBox = new ToolBox();
        
		_frame.setSize(1000,700);   
		_frame.add(ToolBox.ToolBox());
		_frame.setJMenuBar(Menu.Menu());
		_frame.setVisible(true);

	}
}
