package mathodsOfMultithreading;

public class DownloadTask implements Runnable{
@Override
public void run() {
System.out.println("Downloding started.......");
for(int i =1;i<=10;i++) {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		System.out.println("Downlode was intruped");
		return;
	}
	System.out.println("Dowlnloded "+i*10+"%");
	if(Thread.currentThread().isInterrupted()){
		System.out.println("Downloading is stoped by user");
		return;
	}
}
	System.out.println("Download completed succesfully");
}
}
