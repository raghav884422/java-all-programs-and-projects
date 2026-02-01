package threeProjectbyOneObject;

public class activityApp {
	public static void main(String[] args) {
         Activity a= new Activity();
         Thread t1 = new Thread(a);
         Thread t2 = new Thread(a);
         Thread t3 = new Thread(a);
     
         t1.setName("bank");
         t2.setName("print");
         t3.setName("add");
         t1.start();
         t2.start();
         t3.start();
	}
}
