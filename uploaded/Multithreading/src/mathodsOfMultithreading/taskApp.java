package mathodsOfMultithreading;

public class taskApp {
public static void main(String[] args) {
	System.out.println("main mathod stared and share there resources");
	task t1 = new task();
	task t2 = new task();
	task t3 = new task();
	t1.setName("task1");
	t2.setName("task2");
	t3.setName("task3");
	t1.start();
	t2.start();
	t3.start();
	System.out.println(t1.isAlive());
	System.out.println(t2.isAlive());
	System.out.println(t3.isAlive());
	try {
		t1.join();
		t2.join();
		t3.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(t1.isAlive());
	System.out.println(t2.isAlive());
	System.out.println(t3.isAlive());
	System.out.println("main mathod end share there resources");

	}
}

