package MultithreadingUsingrunnableinterface;

public class printing implements Runnable {
	@Override
	public void run() {
		System.out.println("Printing activity started");

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Raghav");
		}
		System.out.println("Printing activity ended");

	}

}
