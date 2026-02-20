package bankProblemDucking;

public class bank {
	public void initiate() {
		System.out.println("Connection to bank server Established");
		try {
			atm a1 = new atm();
			a1.validate();
		} catch (Exception e) {
			System.out.println("issue reached bank form ATM");
		}
		System.out.println("Connection to bank server Terminated");
	}

}
