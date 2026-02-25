package inputOutputStreamFileHandeling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class filereader {
	public static void main(String[] args) {
		  String path1 = "D:\\inputOutputStream\\input.txt";
	      String path2 = "D:\\inputOutputStream\\output.txt";
	      try {
	    	  
	    	  FileReader fr = new FileReader(path1);
	    	  FileWriter fw = new FileWriter(path2);
	    	  int data;
	    	  while((data=fr.read())!=-1) {
	    		  fw.write(data);
	    	  }
	    	  fr.close();
	    	  fw.close();
	      } catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
