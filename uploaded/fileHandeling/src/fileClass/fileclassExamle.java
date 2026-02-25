package fileClass;

import java.io.File;

class fileclassExamle {
	public static void main(String[] args) {
       File file = new File("input.txt");
       
       if(file.exists()) {
    	   System.out.println("yes file is present");
       }
       else {
    	   System.out.println("file is not present");
       }
       
       if(file.isFile()) {
    	   System.out.println("this is a file");
       }
       else {
    	   System.out.println("this is not a file");
       }
       
       if(file.isDirectory()) {
    	   System.out.println("this is a directory");
       }
       else {
    	   System.out.println("this is not a directory");
       }
       System.out.println("Absolute path : "+file.getAbsolutePath());
       System.out.println("Relative path: "+file.getPath());

	}
}