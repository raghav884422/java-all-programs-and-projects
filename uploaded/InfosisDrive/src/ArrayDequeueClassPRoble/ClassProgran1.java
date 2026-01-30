package ArrayDequeueClassPRoble;

import java.util.ArrayDeque;

class ClassProgram1 {
	public static void main(String[] args) {
		ArrayDeque<String> queue = new ArrayDeque<String>();
		queue.offer("task-1");
		queue.offer("task-2");
		queue.offer("task-3");
		System.out.println("queue-> "+queue);
		System.out.println("processing "+queue.poll());
		System.out.println("next in line "+queue.peek());
	}
}