package pac1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class TC_FileIOStream {
	
	FileInputStream sourcefile;
	FileOutputStream destifile;
	
	public void initFile(String srcPath, String destPath) {
		
		try {
			sourcefile = new FileInputStream(srcPath);
			destifile = new FileOutputStream(destPath);
			
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Exception : " + e.getMessage());
		}
	}
	
	public void copyFile() {
		
		try {
			
			int i = sourcefile.read();
			
			while(i!=-1) {
				
				destifile.write(i);
				i  = sourcefile.read();
			}
			
			
		} catch (IOException e) {
			
			System.out.println("Exception : " + e.getMessage());
		}
	}
	
	public void closeFile() {
		
		
		try {
			
			sourcefile.close();
			destifile.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			System.out.println("Exception : " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		
		String sourcefile = "C:\\Users\\pratham.shanbhag\\eclipse-workspace\\Oct2024\\src\\test\\java\\pac1\\sourcefile.txt";
		String destifile= "C:\\Users\\pratham.shanbhag\\eclipse-workspace\\Oct2024\\src\\test\\java\\pac1\\destifile.txt";
		
		TC_FileIOStream fileIO = new TC_FileIOStream();
		
		fileIO.initFile(sourcefile, destifile);
		fileIO.copyFile();
		fileIO.closeFile();
	}
 
}