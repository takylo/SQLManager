package main;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

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
	public static void WriteFile(String filename,String txt){
		File file = new File("data/"+filename+"");
		try {
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(txt);
			bw.close();
		} catch (Exception e) {} // ne devrait pas se produire
	}
	
	public static void ADD_PAUSE(int time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}