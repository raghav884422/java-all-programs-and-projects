package ArrayDequeue;

import java.util.ArrayDeque;

public class StackByUsingArrayDequeue {
	public static void main(String[] args) {
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		stack.add(10);
		stack.add(20);
		stack.add(30);
		stack.add(40);
		stack.add(50);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pollLast());
		System.out.println(stack.pollLast());
		System.out.println(stack.pollLast());
		System.out.println(stack.pollLast());
		
	}

}
