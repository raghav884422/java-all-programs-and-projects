package inputOutputStreamFileHandeling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class fileHandeling {
	public static void main(String[] args) {
      String path1 = "D:\\inputOutputStream\\input.txt";
      String path2 = "D:\\inputOutputStream\\output.txt";
      try {
    	  
    	  FileInputStream fis = new FileInputStream(path1);
    	  FileOutputStream fos = new FileOutputStream(path2);
    	  int data;
    	  while((data=fis.read())!=-1) {
    		  fos.write(data);
    	  }
      } catch (Exception e) {
		e.printStackTrace();
	}
	}
}
