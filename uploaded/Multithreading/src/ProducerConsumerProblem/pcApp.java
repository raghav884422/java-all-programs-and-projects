package ProducerConsumerProblem;

public class pcApp {
public static void main(String[] args) {
	factory f = new factory();
	producer p = new producer(f);
	consumer c = new consumer(f);
	c.start();
	p.start();
}
}
