package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class comparableStringProblemDecendingOr {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // TODO: Read the number of strings (n)
	        int n = sc.nextInt();
	        // TODO: Create an ArrayList to store CustomString objects
	        ArrayList<CustomString> al = new ArrayList<>();
	        for(int i = 1;i<=n;i++){
	            String str = sc.next();
	            al.add(new CustomString(str));
	        }
	        System.out.println(al);
	       Collections.sort(al);
	       System.out.println(al);

	        // TODO: Add CustomString objects to the ArrayList
	        // TODO: Sort the list of CustomString objects in reverse alphabetical order
	        
	        sc.close();
	    }
	}

	class CustomString implements Comparable<CustomString> {
	    private String str;
	    public CustomString(String str) {
	        this.str = str;
	    }
	   public int compareTo(CustomString c){
	       return this.str.compareTo(c.str);
	    }
	    public String toString() {
	        return str;
	    }

	    // TODO: Implement constructor, compareTo, and other necessary methods
	}

