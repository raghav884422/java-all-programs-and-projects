package mathodsOfMultithreading;

public class task extends Thread {
	@Override
	public void run() {
      String name = Thread.currentThread().getName();
      if(name.equals("task1")) {
    	  task1();
      }
      else if(name.equals("task2")) {
    	  task2();
      }
      else {
    	  task3();
      }
	}

	void task1() {
         System.out.println("task 1 is started");
         for(int i =1;i<=5;i++) {
        	 System.out.println("task 1 is using resources");
        	 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
         }
         System.out.println("task 1 is ended");
	}
	void task2() {
        System.out.println("task 2 is started");
        for(int i =1;i<=5;i++) {
       	 System.out.println("task 2 is using resources");
       	 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
        }
        System.out.println("task 2 is ended");
	}
	void task3() {
        System.out.println("task 3 is started");
        for(int i =1;i<=5;i++) {
       	 System.out.println("task 3 is using resources");
       	 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
        }
        System.out.println("task 3 is ended");
	}
}
