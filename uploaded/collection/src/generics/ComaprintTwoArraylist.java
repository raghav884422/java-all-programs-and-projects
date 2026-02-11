package generics;

import java.util.LinkedList;
import java.util.Scanner;

public class ComaprintTwoArraylist {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        // TODO: Read the number of books (n)
	        int n = sc.nextInt();
	        LinkedList<String> ll = new LinkedList<>();
	        for(int i=1;i<=n;i++) {
	            ll.add(sc.next());
	        }
	        String key =sc.next();
	        int count=0;
	        if(ll.contains(key)){

	        System.out.println("First occurrence of "+key+": "+ll.indexOf(key));
	        System.out.println("Last occurrence of "+key+": "+ll.lastIndexOf(key));
	        }else {
	            System.out.println("\""+key+"\" is not present in the list.");
	        }
	   
	        // TODO: Create a LinkedList to store book titles
	        // TODO: Read and add n book titles to the LinkedList
	        // TODO: Read the book title to search for
	        // TODO: Find and print the first and last occurrence indices
	        sc.close();
	    }
	}
