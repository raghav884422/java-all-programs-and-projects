package deadlock;

public class worrior1App {
	public static void main(String[] args) {
		worrior1UsingThreads t1 = new worrior1UsingThreads();
		worrior1UsingThreads t2 = new worrior1UsingThreads();
		t1.setName("karna");
		t2.setName("arjuna");
		t1.start();
		t2.start();
		
	}

}
