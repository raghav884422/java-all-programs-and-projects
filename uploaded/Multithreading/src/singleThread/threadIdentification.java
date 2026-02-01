package singleThread;

public class threadIdentification {
public static void main(String[] args) {
	Thread t = Thread.currentThread();
	System.out.println(t);
	t.setName("raghav");
	t.setPriority(2);
	System.out.println(t);
}
}
