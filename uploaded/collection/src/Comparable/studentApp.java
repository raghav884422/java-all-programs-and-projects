package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class studentApp {
public static void main(String[] args) {
	Student s1 = new Student(1, "raghav", 10, 1);
	Student s2 = new Student(2, "mohan", 20, 1);
	Student s3 = new Student(3, "sohan", 30, 1);
	Student s4 = new Student(4, "ram", 4, 1);
	Student s5 = new Student(5, "shyam", 5, 1);
	ArrayList hs = new ArrayList();
	hs.add(s1);
	hs.add(s2);
	hs.add(s3);
	hs.add(s4);
	hs.add(s5);
	System.out.println(hs);
	Collections.sort(hs);
	System.out.println(hs);
	
}
}
