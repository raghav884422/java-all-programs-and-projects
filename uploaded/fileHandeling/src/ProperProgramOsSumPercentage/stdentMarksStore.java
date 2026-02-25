package ProperProgramOsSumPercentage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class stdentMarksStore {
	public static void main(String[] args) throws IOException {
		 Scanner sc = null ;
		 FileWriter fw = null;
		 BufferedWriter bw = null;
		try {
		String path = "D:\\inputOutputStream\\StudentResult1.txt";
      sc = new Scanner(System.in);
      String subject [] = {"kannad","math","hindi","english","science"};
      fw= new FileWriter(path);
       bw = new BufferedWriter(fw);
      int totalSum = 0;
      for(int i =0;i<=subject.length-1;i++) {
    	  int marks = sc.nextInt();
    	  bw.write(subject[i]+" : "+marks+"\n");
    	  totalSum +=marks;
      }
      bw.write("Total sum:"+totalSum+"\n");
      double percentage = totalSum/6.0;
      bw.write("Total percentage:"+percentage+"\n");
      }
      finally {
    	  sc.close();
    	   bw.close();
    	   fw.close();
    	   
      }
	}
}
