package project36;

import java.io.*;

import javax.swing.JOptionPane;

/**
 * @author Troopa
 * @version 23.02.2014
 */
public class Main {
	
	public static void main(String[] args) throws IOException {
		File f = new File("static.html");
		FileWriter fw = new FileWriter(f);
		Sitegenerator s = new Sitegenerator(f, fw);
		s.generateBase(
				JOptionPane.showInputDialog(null, "Please enter the title of your Website:"),
				JOptionPane.showInputDialog(null, "Please enter the content of your Website(You can use html-tags):")
				);
	}

}
