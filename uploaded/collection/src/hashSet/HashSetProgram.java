package hashSet;

import java.util.*;
public class HashSetProgram {
		    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int[] arr = new int[N];
	        for (int i = 0; i < N; i++) {
	            arr[i] = sc.nextInt();
	        }
	        removeDuplicates(arr);
	    }

	    public static void removeDuplicates(int[] arr) {
	        // Your code here
	        HashSet<Integer> hs = new HashSet<Integer>();
	        for(int i =0;i<=arr.length-1;i++) {
	               hs.add(arr[i]);
	        }
	        ArrayList<Integer> al = new ArrayList<Integer>(hs);
	        Collections.sort(al);
	        System.out.println(al);
	        
	    }
	
}