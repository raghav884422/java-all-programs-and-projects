package deadlock;

public class worrierApp {
     public static void main(String[] args) {
		worrior w = new worrior();
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		t1.setName("karna");
		t2.setName("arjuna");
		t1.start();
		t2.start();
	}

}
