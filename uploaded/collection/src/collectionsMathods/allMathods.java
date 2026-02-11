package collectionsMathods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class allMathods {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(100);
	al.add(50);
	al.add(150);
	al.add(25);
	al.add(75);
	al.add(125);
	al.add(175);
	System.out.println("al--> "+al);
	Collections.sort(al);
	System.out.println("al--> "+al);
	Collections.reverse(al);
	System.out.println("al--> "+al);
	
	ArrayList al2 = new ArrayList();
	al2.add(86);
	al2.add(42);
	al2.add(23);
	al2.add(18);
	al2.add(25);
	al2.add(25);
	System.out.println("al2--> "+al2);
	Comparator coparator=Collections.reverseOrder();
	Collections.sort(al2,coparator);
	System.out.println("al2--> "+al2);
	System.out.println(Collections.max(al2));
	System.out.println(Collections.min(al2));
	System.out.println(Collections.frequency(al2,25));
	Collections.sort(al2);
	System.out.println(Collections.binarySearch(al2, 18));
	System.out.println(Collections.disjoint(al,al2));
	 
	
	
	
}
}
