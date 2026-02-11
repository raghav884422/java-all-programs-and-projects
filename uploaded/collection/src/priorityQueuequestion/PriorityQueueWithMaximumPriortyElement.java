package priorityQueuequestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueWithMaximumPriortyElement {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    
	for(int i =1;i<=n;i++) {
	pq.add(sc.nextInt());	
	}
	pq.add(sc.nextInt());
	
	PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(pq);
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	while(!pq1.isEmpty()) {
		al.add(pq1.poll());
	}
	Collections.reverse(al);
	al.removeFirst();
	System.out.println(al);
	
	
	

	
	
	
}
}
