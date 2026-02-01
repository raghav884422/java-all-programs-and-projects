package syncronisation;

import java.util.Iterator;

public class bathRoom implements Runnable {
	@Override
	 synchronized public void run() {
       try {
    	   String name = Thread.currentThread().getName();
    	   System.out.println(name+" is entering the bathroom");
    	   admire();
    	   Thread.sleep(1000);
    	   System.out.println(name+" is useing the bathroom");
    	   Thread.sleep(5000);
    	   System.out.println(name+" is exitting the bathroom");
    	   Thread.sleep(5000);
    	   
       }
       catch (Exception e) {
		e.printStackTrace();
    	   // TODO: handle exception
	}
	}
	void admire(){
		try {
			for (int i =1;i<=3;i++) {
				
				System.out.println(Thread.currentThread().getName()+" is admiring the bathroom");
				Thread.sleep(2000);
				
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
