package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class compareString {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // TODO: Read the number of strings (n)
	        int n = sc.nextInt();

	        // TODO: Create an ArrayList to store the strings
	        ArrayList <String> al = new ArrayList();

	        // TODO: Add strings to the ArrayList
	        for(int i = 1;i<=n;i++){
	            al.add(sc.next());
	        }

	        // TODO: Sort the list using a custom Comparator
	        Collections.sort(al,new acendingOrder());
	        System.out.println(al);

	        sc.close();
	    }
	}
	class acendingOrder implements Comparator<String>{
	    public int compare(String a, String b) {
	        return a.compareTo(b);
	    }
	
}
