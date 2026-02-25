package inputOutputStreamFileHandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class sumOfallNuberOfOneFile {
   public static void main(String[] args) {
	   try {
	String path1 = "D:\\inputOutputStream\\input.txt";
	String path2 = "D:\\inputOutputStream\\sum.txt";
		FileInputStream fis = new FileInputStream(path1);
		FileOutputStream fos = new FileOutputStream(path2);
		int data;
		int sum;   // not known by me how to sum
		while((data=fis.read())!=-1) {
			fos.write(data);
		}
	} 
	   catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
