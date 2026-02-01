package deadlock;

public class worrior1UsingThreads extends Thread {
	String resource1 = "sarpaasta";
	String resource2 = "garunarastra";
	String resource3 = "pushpastra";

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		if (name.equals("karna")) {
			karnaAqureResource();
		} else {
			ArgunaAqureResource();
		}

	}

	public void karnaAqureResource() {
		try {
			Thread.sleep(5000);
			synchronized (resource1) {
				System.out.println(Thread.currentThread().getName() + " is aqurning " + resource1);
				Thread.sleep(5000);
				synchronized (resource2) {
					System.out.println(Thread.currentThread().getName() + " is aqurning " + resource2);
					Thread.sleep(5000);
					synchronized (resource3) {
						System.out.println(Thread.currentThread().getName() + " is aqurning " + resource3);
					}
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ArgunaAqureResource() {
		try {
			Thread.sleep(5000);
			synchronized (resource3) {
				System.out.println(Thread.currentThread().getName() + " is aqurning " + resource1);
				Thread.sleep(5000);
				synchronized (resource2) {
					System.out.println(Thread.currentThread().getName() + " is aqurning " + resource2);
					Thread.sleep(5000);
					synchronized (resource1) {
						System.out.println(Thread.currentThread().getName() + " is aqurning " + resource3);
					}
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
