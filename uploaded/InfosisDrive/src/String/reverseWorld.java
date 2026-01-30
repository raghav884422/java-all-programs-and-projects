package String;
import java.util.*;

public class reverseWorld {

    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String s = scanner.nextLine();
	        System.out.println(reverseWords(s));
	        scanner.close();
	    }

	    public static String reverseWords(String s) {
	        // Write your code here...
	      
	      String arr []=s.trim().split("\\s+");
	      StringBuffer sb = new StringBuffer();
	      for(int i=arr.length-1;i>=0;i--) {
              sb.append(arr[i]);
              if(i>0) { 
            	  sb.append(" ");
              }
	      }
	      return sb.toString();
	    }

}


