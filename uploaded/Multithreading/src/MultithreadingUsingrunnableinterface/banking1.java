package MultithreadingUsingrunnableinterface;

import java.util.Scanner;

public class banking1 implements Runnable{
	@Override
	public void run() {
		System.out.println("bank activity start exicuitng");
		Scanner sc = new Scanner(System.in);
		int pass = 1234;
		int upass = sc.nextInt();
//		use to provied delay to program to exicute
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (pass == upass) {
			System.out.println("Access your account");
		} else {
			System.out.println("password wrong access denied");
		}
		System.out.println("bank activity exicuition ended");

	}
}
