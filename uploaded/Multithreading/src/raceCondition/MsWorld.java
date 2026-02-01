package raceCondition;

public class MsWorld extends Thread {
	@Override
	public void run() {
		String s = Thread.currentThread().getName();
		if(s.equals("type")) {
			typing();
		}
		if(s.equals("spelling")) {
			spellingcheck();
		}
		else {
			save();
		}
	}

	void typing() {
		for (int i = 1; i <= 5; i++) {

			System.out.println("Typing...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	void spellingcheck() {
		for (int i = 1; i <= 5; i++) {

			System.out.println("spelling check is happend...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	void save() {
		for (int i = 1; i <= 5; i++) {

			System.out.println("Auto save...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
