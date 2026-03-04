package interfacequestion;

	class ChaseBank implements BankService {
	private double balance = 0;

	public void deposit(double amount) {
	         balance += amount;
	           System.out.println("ChaseBank: Deposited $" + amount);
	    }

	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	           System.out.println("ChaseBank: Withdrawn $" + amount);
	        } else {
	           System.out.println("ChaseBank: Insufficient funds");
	        }
	    }

	    public double checkBalance() {
	           System.out.println("ChaseBank: Current balance is $" + balance);
	         return balance;
	    }

	    public void transfer(double amount, String toAccount) {
	       if (balance >= amount) {
	        balance -= amount;
	           System.out.println("ChaseBank: Transferred $" + amount + " to " + toAccount);
	       } else {
	           System.out.println("ChaseBank: Insufficient funds for transfer");
	       }
	}
	
}
