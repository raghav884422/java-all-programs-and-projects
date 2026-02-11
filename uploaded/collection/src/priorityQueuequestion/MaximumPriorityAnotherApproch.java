package priorityQueuequestion;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximumPriorityAnotherApproch {
	

		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
			
			for(int i =0; i<n ;i++) {
				pq.add(sc.nextInt());
			}
			
			pq.add(sc.nextInt());
			
			pq.poll();
			
//			System.out.println(pq);
			
			while(!pq.isEmpty()) {
				System.out.print(pq.poll()+" ");
			}
			System.out.println();
			
			
			
			
			

		}

	

}
