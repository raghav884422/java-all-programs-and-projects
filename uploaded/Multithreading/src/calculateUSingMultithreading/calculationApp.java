package calculateUSingMultithreading;

public class calculationApp {
public static void main(String[] args) {
	calculation c = new calculation();
	Thread t1 = new Thread(c);
	Thread t2 = new Thread(c);
	Thread t3 = new Thread(c);
	t1.setName("add");
	t2.setName("sub");
	t3.setName("mul");
	
	t1.start();
	t2.start();
	t3.start();
	
	
}
}
