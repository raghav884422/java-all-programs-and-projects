package customiseExpections;

public class bank {
	public void initiate() {
		
		atm a1 = new atm();
		try {
			a1.takeInput();
			a1.validate();
		} 
		catch (Exception e) {
			System.out.println("issue reached bank form ATM");
			e.printStackTrace();
		}
	
	}

}
