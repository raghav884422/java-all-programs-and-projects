package arrayListFuctioning;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedList1 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add("ramu");
		ll.add(2.655165);
		System.out.println(ll);
		ll.addFirst(9);
		System.out.println(ll);
		ll.addLast(99);
		System.out.println(ll);
		ll.add(5, 999);
		System.out.println(ll);
		
		
	
		ArrayList al = new ArrayList();
		al.add(8);
		al.add(88);
		al.add(888);
		System.out.println("arraylist "+al);
		System.out.println("linklist "+ll);
		
		
		
		ll.addAll(al);
		System.out.println("ll-> "+ll);
		ll.addAll(0, al);
		System.out.println("ll-> "+ll);		
          System.out.println(al.containsAll(ll));
          System.out.println(ll.containsAll(al));
          
           LinkedList stack = new LinkedList();
           stack.push(100);
           stack.push(200);
           stack.push(300);
           stack.push(400);
           System.out.println("ll as stack " + stack);
           System.out.println(stack.pop());
           System.out.println(stack.pop());
           System.out.println(stack.pop());
           System.out.println(stack.pop());
          
           
           LinkedList queue = new LinkedList();
           queue.add(9);
           queue.add(99);
           queue.add(999);
           queue.add(9999);
           System.out.println("ll is -> " + queue);
           System.out.println(queue.remove());
           System.out.println(queue.remove());
           System.out.println(queue.remove());
           System.out.println(queue.remove());
           
          
		
		
	}

}
