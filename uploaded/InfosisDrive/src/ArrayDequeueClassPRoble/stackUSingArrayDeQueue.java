package ArrayDequeueClassPRoble;

import java.util.ArrayDeque;

public class stackUSingArrayDeQueue {
	
	public static void main(String[] args) {
	ArrayDeque<Integer> stack = new ArrayDeque<>();
	stack.push(10);
	stack.push(20);
	stack.push(30);
	System.out.println("Stack: "+ stack);
	System.out.println("Pop: "+ stack.pop()); // 30
	System.out.println("Top: "+ stack.peek()); // 20
	}
	

}
