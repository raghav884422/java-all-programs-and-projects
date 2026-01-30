package hashsetclassAndProblrm;

import java.net.Inet4Address;
import java.util.HashSet;

public class unionIntersectionDifference {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		System.out.println("hashset 1 = "+hs);
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(1);
		hs2.add(2);
		hs2.add(3);
		hs2.add(9);
		System.out.println("hashset 2 = "+hs2);
		
		
		HashSet<Integer> union = new HashSet<Integer>(hs);
		union.addAll(hs2);
		System.out.println("Union => "+union);
		
		HashSet<Integer> intersection = new HashSet<Integer>(hs);
		intersection.retainAll(hs2); 
		System.out.println("Intersection => "+intersection);
		
		HashSet<Integer> difference = new HashSet<Integer>(hs);
		difference.removeAll(hs2);
		System.out.println("Difference => "+difference);
		
		
	}

}
