package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Collectionshort {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
           al.add(100);
           al.add(25);
//           al.add("raju");
//           al.add(true);
           al.add(75);
           al.add(1);
           al.add(50);
           System.out.println("befor sorting");
           System.out.println(al);
           System.out.println("After sorting");
           Collections.sort(al);
           System.out.println(al);
           System.out.println("Decending Order");
           Collections.reverse(al);
           System.out.println(al);
           
	}
}
