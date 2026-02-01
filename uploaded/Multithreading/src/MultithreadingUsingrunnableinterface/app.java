package MultithreadingUsingrunnableinterface;

public class app {
public static void main(String[] args) {
	banking1 b = new banking1();
	printing p = new printing();
	addition a  = new addition();
	Thread  t1 = new Thread(b);
	Thread  t2 = new Thread(p);
	Thread  t3 = new Thread(a);
	t1.start();
	t2.start();
	t3.start();
}
}
