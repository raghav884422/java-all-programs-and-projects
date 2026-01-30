package hashsetclassAndProblrm;

import java.util.HashSet;
import java.util.Scanner;

public class nameIsAddedOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	    HashSet<String> names = new HashSet<String>();
	    while(true) {
	    	System.out.println("Enter name (or exit) : ");
	    	String name = sc.nextLine();
	    	if(name.equalsIgnoreCase("exit")) 
	    		break;
	    	if(!names.add(name)) {
	    		System.out.println("dublicate name fount");
	    		
	    	}else {
	    		System.out.println("Added Sucessfully");
	    	}
	    
	    	}
		sc.close();
	}

}
