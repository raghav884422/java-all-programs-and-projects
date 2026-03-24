package rough;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class hashmap {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[][]= new int [][];
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>((int a,int b)->
	 (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])));

     for (int[] point : points) {
         pq.offer(point);
         if (pq.size() > k) {
             pq.poll();
         }
     }

     int[][] result = new int[k][2];
     while (k > 0) {
         result[--k] = pq.poll();
     }

	
	
}
}
