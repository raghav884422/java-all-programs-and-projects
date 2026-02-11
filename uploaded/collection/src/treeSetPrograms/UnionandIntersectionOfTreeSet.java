package treeSetPrograms;

import java.util.Scanner;
import java.util.TreeSet;

public class UnionandIntersectionOfTreeSet {
public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // TODO: Read the number of products in Electronics category (n1)
	       int n1=sc.nextInt();
	        // TODO: Create a TreeSet to store product names for Electronics
	        TreeSet<String> electronics = new TreeSet<>();
	        // TODO: Read and add n1 product names to the Electronics TreeSet
	        for(int i=1;i<=n1;i++){
	            electronics.add(sc.next());
	        }

	        // TODO: Read the number of products in Home Appliances category (n2)
	       int n2=sc.nextInt();
	        // TODO: Create a TreeSet to store product names for Electronics
	        TreeSet<String> homeApplince = new TreeSet<>();
	        // TODO: Read and add n1 product names to the Electronics TreeSet
	        for(int i=1;i<=n2;i++){
	            homeApplince.add(sc.next());
	        }
	        
	        
	        TreeSet<String> union = new TreeSet<>(electronics);
	        union.addAll(homeApplince);
	        System.out.println(union);
	       
	        TreeSet<String> intersection =new TreeSet<String>(electronics);
	        intersection.retainAll(homeApplince);
	        System.out.println(intersection);
	        TreeSet<String> differnce = new TreeSet<String>(electronics);
	        
	        differnce.removeAll(homeApplince);
	        if(differnce.isEmpty()) {
	        	System.out.println("No item");
	        }
	        else {
	        	System.out.println(differnce);
	        }
	        sc.close();
	    }
	
}

