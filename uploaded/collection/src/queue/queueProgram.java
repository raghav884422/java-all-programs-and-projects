package queue;

import java.util.LinkedList;
import java.util.Queue;

public class queueProgram {
public static void main(String[] args) {
	Queue<Integer> queue = new LinkedList<Integer>();
	queue.add(10);
	queue.add(20);
	queue.add(30);
	queue.add(40);
	queue.offer(50);
	System.out.println("queue is "+queue);
	queue.poll();
	System.out.println("queue is "+queue);
	queue.poll();
	System.out.println("queue is "+queue);
	queue.poll();
	System.out.println("queue is "+queue);
	queue.poll();
	System.out.println("queue is "+queue);
	queue.remove();
	System.out.println("queue is "+queue);
//	poll and remove are same
//	peek is only to show data
	
}
}
