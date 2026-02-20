package BankProblemThrowsException;

public class bankApp {
public static void main(String[] args) {
	System.out.println("Connection established to Main");
	try {
	bank b = new bank();
	b.initiate();
	}catch (Exception e) {
		System.out.println("issue reach to main brach it will solve soon");
	}
	System.out.println("Connection established to Main");
}
}
