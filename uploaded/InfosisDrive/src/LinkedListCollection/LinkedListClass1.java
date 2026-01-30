package LinkedListCollection;

import java.util.LinkedList;

class LinkedListClass1{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(100);
		list.add(50);
		list.add(150);
		list.add(25);
		list.add(75);
		list.add(125);
		list.add(175);
		System.out.println("linkedList -> "+list);
		System.out.println(list.peek());  // it only fetch the element
		System.out.println("linkedList -> "+list);
		System.out.println(list.poll()); // it delete the element
		System.out.println("linkedList -> "+list);
		
	}
}