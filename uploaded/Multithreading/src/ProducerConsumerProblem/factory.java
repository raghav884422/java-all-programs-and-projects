package ProducerConsumerProblem;

public class factory {
	int x;
	boolean isProduction = false;

	 synchronized public void setData(int data) throws InterruptedException {
		if (isProduction) {
			wait();
		}
		x = data;
		System.out.println("Producer has produce" + x);
		isProduction = true;
		notify();
	}
	 synchronized public void getData() throws InterruptedException {
		if(isProduction == false) {
			wait();
		}
		System.out.println("consumer has consumed "+x);
		isProduction= false;
		notify();
	}
}
