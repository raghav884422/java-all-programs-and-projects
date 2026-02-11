package priorityQueuequestion;

import java.util.PriorityQueue;
import java.util.Scanner;

public class prioerityQueueQuetion1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=1;i<=n;i++) {
			pq.add(sc.nextInt());
		}
		pq.add(sc.nextInt());
		pq.poll();
		System.out.println("updated list: ");
	
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		pq1.addAll(pq);
		while(!pq1.isEmpty()) {
			System.out.print(pq1.poll()+ " ");
		}
		
		
	}

}
