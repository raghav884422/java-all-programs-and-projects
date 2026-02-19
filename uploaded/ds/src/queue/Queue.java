package queue;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Iterator;

class Queue{
   private int size;
	private int arr[];
	int front = -1;
	int rare = -1;
	
	public Queue(int size) {
	  arr = new int[size];
		this.size = size;
	}
	
	public void insert(int value) {
		if(rare!=arr.length-1) {
		
		rare++;
		arr[rare] = value;
		}else {
			
			System.out.println("Queue is full");
		}
	}
	public void delete() {
		if (front==-1 && rare==-1) {
			System.out.println("Que is empty");
		}
	
		else if(front!=arr.length-1) {
			
		front++;
		arr[front] = 0;
		}else {
			
			System.out.println("Queue is empty");
		
		
	}	
}
	public void display() {
		
		if(front == rare) {
			System.out.println("is empty");
		}else {
			for (int i = rare+1;i<=arr.length-1;i++) {
				System.out.println(arr[i]);
			
		}
		
	}
}
}