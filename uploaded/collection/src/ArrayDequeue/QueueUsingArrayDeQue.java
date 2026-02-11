package ArrayDequeue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueUsingArrayDeQue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	ArrayDeque<Integer> queue = new ArrayDeque();
	for(int i =1;i<=n;i++) {
		
		queue.add(sc.nextInt());
	}
	System.out.println(queue);
	for(int x:queue) {
		System.out.println(queue.poll());
	}
//	queue.add(20);
//	queue.add(30);
//	queue.add(40);
//	System.out.println("queue is "+queue);
//
//	System.out.println(queue.poll());
//	System.out.println("queue is "+queue);
//	System.out.println(queue.poll());
//	System.out.println("queue is "+queue);
//	System.out.println(queue.poll());
//	System.out.println("queue is "+queue);
//	System.out.println(queue.poll());
//	System.out.println("queue is "+queue);
//	
	
	
	
	
	
	}
	}