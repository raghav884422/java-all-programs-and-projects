package treeSetPrograms;

import java.util.*; 
public class treesetprogram {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        // Read the number of candidate names
	        int n = sc.nextInt();
	        sc.nextLine(); // Consume the newline character
	        
	        // Initialize TreeSet to store unique and sorted candidate names
	        TreeSet<String> ts = new TreeSet<String>();
	   
	        for(int i=0;i<=n;i++) {
	        
	        ts.add(sc.next());
	        }
	        for(String x: ts) {
	            System.out.println(x);
	        }
	        
	        // Read and store candidate names
	        
	        
	        // Write your code here to print the sorted and unique candidate names
	    }
	}

}
