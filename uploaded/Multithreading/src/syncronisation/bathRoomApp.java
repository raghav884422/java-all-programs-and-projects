package syncronisation;

public class bathRoomApp {
	public static void main(String[] args) {
		bathRoom b1 = new bathRoom();
      Thread t1 = new Thread(b1);
      Thread t2 = new Thread(b1);
      Thread t3 = new Thread(b1);
       t1.setName("Boy");
      t2.setName("Girl");
      t3.setName("Other");
      
      t1.start();
      t2.start();
      t3.start();
	}
}
