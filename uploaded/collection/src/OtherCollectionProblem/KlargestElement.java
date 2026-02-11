package OtherCollectionProblem;

import java.util.*;
public class KlargestElement {

	    public static List<Integer> findKLargest(int[] arr, int k) {
	       PriorityQueue <Integer> pq = new PriorityQueue();
	       for(int n : arr) {
	        pq.add(n);
	        if(pq.size()>k){
	            pq.poll();
	        }
	        }
	        ArrayList<Integer> al = new ArrayList(pq);
	        Collections.reverse(al);

	       
	       return al;
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
	        int k = sc.nextInt();

	        // Find and print the k largest elements
	        List<Integer> result = findKLargest(arr, k);
	        System.out.println("Input: arr = " + Arrays.toString(arr) + ", k = " + k);
	        System.out.println("Output: " + result);
	    }
	}


