package ArrayDequeueClassPRoble;

import java.util.ArrayDeque;

public class ArraydequeueBothEnd {
	public static void main(String[] args) {
		ArrayDeque<String> dq = new ArrayDeque<String>();
		dq.addFirst("a");
		dq.addLast("b");
		dq.addFirst("c");
		dq.addLast("d");
		System.out.println("Dequeue " + dq);
		System.out.println("remove first "+dq.removeFirst());;
		System.out.println("remove last "+dq.removeLast());
		System.out.println("array deque "+dq);
	}

}
