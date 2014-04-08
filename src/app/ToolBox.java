package app;

import java.awt.Component;
import main.Load;
import javax.swing.JPanel;

public class ToolBox {
	
	public static Component ToolBox() {
		
		JPanel _Box = new JPanel();
		_Box.setSize(300,200);
		_Box.add(Load.CREATE_TABLE);
		_Box.add(Load.DELETE_TABLE);
		return _Box;
		
	}
}