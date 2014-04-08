package main;
import java.awt.BorderLayout;

import javax.swing.JFrame;

import app.AppBdd;
import app.AppTable;
import app.Menu;
import app.ToolBox;

public class ManageApp {
	public ManageApp(){
		JFrame _frame = new JFrame();
        // ToolBox _ToolBox = new ToolBox();
		_frame.setSize(1000,700);   
		_frame.setLayout(new BorderLayout());
		_frame.add(ToolBox.ToolBox(),BorderLayout.NORTH);
		_frame.add(AppBdd.AppBdd(),BorderLayout.WEST);
		_frame.add(AppTable.AppTable(),BorderLayout.CENTER);
		_frame.setJMenuBar(Menu.Menu());
		_frame.setVisible(true);

	}
}
