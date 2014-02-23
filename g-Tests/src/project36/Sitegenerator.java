/**
 * 
 */
package project36;

import java.io.*;

/**
 * @author Troopa
 * @version 23.02.2014
 */
public class Sitegenerator {
	
	File f;
	FileWriter fw;
	
	public Sitegenerator(File f, FileWriter fw) {
		this.f = f;
		this.fw = fw;
	}
		
	public void generateBase(String title, String content) throws IOException{
		fw.write("<html>");
		fw.write("<head>");
		fw.write("<title>" + title + "</title>");
		fw.write("</head>");
		fw.write("<body>");
		fw.write(content);
		fw.write("</body>");
		fw.write("</html>");
		fw.close();
	}

}
