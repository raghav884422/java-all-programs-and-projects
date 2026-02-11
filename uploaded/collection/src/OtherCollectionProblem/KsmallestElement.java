package OtherCollectionProblem;

import java.util.*;
public class KsmallestElement {

	    public static List<Integer> findKSmallest(int[] arr, int k) {
	    	 PriorityQueue <Integer> pq = new PriorityQueue<>();
		       for(int n : arr) {
		        pq.add(n);
		        }
		       ArrayList<Integer> al = new ArrayList(pq);
		       ArrayList<Integer> al2 = new ArrayList<Integer>();
		       Collections.sort(al);
               for(int i =1;i<=k;i++) {
               al2.add(pq.poll());
               }
		       
		       return al2;

	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input array size
	        int n = sc.nextInt();

	        // Input array elements
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Input value of k
	        System.out.print("Enter the value of k: ");
	        int k = sc.nextInt();

	        // Find and print the k smallest elements
	        List<Integer> result = findKSmallest(arr, k);
	        System.out.println("Input: arr = " + Arrays.toString(arr) + ", k = " + k);
	        System.out.println("Output: " + result);
	    }
	}


