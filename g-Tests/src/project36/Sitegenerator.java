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
		fw.write("<html> \n");
		fw.write("<head> \n");
		fw.write("<title> \n" + title + "\n</title> \n");
		fw.write("</head>\n");
		fw.write("<body>\n");
		fw.write(content);
		fw.write("\n</body> \n");
		fw.write("</html> \n");
		fw.close();
	}

}
