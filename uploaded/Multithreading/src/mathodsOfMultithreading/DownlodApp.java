package mathodsOfMultithreading;

public class DownlodApp {
public static void main(String[] args) {
	Thread dt = new Thread(new DownloadTask());
	dt.start();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("user decided to cancel the download");
	dt.interrupt();
}
}
