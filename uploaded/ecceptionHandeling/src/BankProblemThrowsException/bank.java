package BankProblemThrowsException;

public class bank {
	    public  void initiate()throws Exception {
	    	System.out.println("Connection to bank server Established");
	    	try {
	    	atm a1 = new atm();
	    	a1.validate();
	    	}
	    	catch(Exception e){
	    		System.out.println("issue reached bank form ATM");
	    		throw e;
	    	}
	    	finally {
				
	    		System.out.println("Connection to bank server Terminated");
			}
	    }

}
