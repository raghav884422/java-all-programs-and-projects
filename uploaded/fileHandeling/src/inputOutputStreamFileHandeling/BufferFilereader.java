package inputOutputStreamFileHandeling;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
public class BufferFilereader {
	
		public static void main(String[] args) {
		      try {
		    	  String path1 = "D:\\inputOutputStream\\input.txt";
		    	  String path2 = "D:\\inputOutputStream\\output.txt";
		    	  
		    	  FileReader fr = new FileReader(path1);
		    	  FileWriter fw = new FileWriter(path2);
		    	  BufferedReader br = new BufferedReader(fr);
		    	  BufferedWriter bw = new BufferedWriter(fw);
		    	  String data;
		    	  while((data=br.readLine())!=null) {
		    		  bw.write(data);
		    	  }
		    	  br.close();
		    	  bw.close();
		    	  fr.close();
		    	  fw.close();
		      } catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
