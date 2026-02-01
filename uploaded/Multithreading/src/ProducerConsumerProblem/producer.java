package ProducerConsumerProblem;

public class producer extends Thread {
factory fact ;

public producer(factory fact) {
	
	this.fact = fact;
}
@Override
	public void run() {
		int a =0;
		while(true) {
			try {
				fact.setData(++a);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
