package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class personApp {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // TODO: Read the number of people (n)
	        int n = sc.nextInt();
	        ArrayList al = new ArrayList();
	        for(int i =1;i<=n;i++) {
	            String name =sc.next();
	            int age = sc.nextInt();
	            al.add(new Person(name,age));
	        }
	        Collections.sort(al);
	        System.out.println("People sorted by age:");
	        for(Object x:al){

	        System.out.println(x);
	        }
	}

}
