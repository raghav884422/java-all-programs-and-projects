package ProducerConsumerProblem;

public class consumer extends Thread {
	factory fact;

	public consumer(factory fact) {

		this.fact = fact;
	}

	@Override
	public void run() {
		while (true) {
			try {
				fact.getData();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
