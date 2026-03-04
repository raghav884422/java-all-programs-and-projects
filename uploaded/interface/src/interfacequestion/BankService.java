package interfacequestion;
interface BankService {
    public void deposit(double amount);
    public void withdraw(double amount);
    public double checkBalance();
    public void transfer(double amount, String toAccount);
}

class CitiBank implements BankService {
 double balance;

    public void deposit(double amount) {
           balance += amount;
           System.out.println("CitiBank: Deposited $" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
           System.out.println("CitiBank: Withdrawn $" + amount);
        }
        else {
           System.out.println("CitiBank: Insufficient funds");
        }
    }

    public double checkBalance() {
           System.out.println("CitiBank: Current balance is $" + balance);
         return balance;
    }

    public void transfer(double amount, String toAccount) {
       if (balance >= amount) {
        balance -= amount;
           System.out.println("CitiBank: Transferred $" + amount + " to " + toAccount);
       } else {
           System.out.println("CitiBank: Insufficient funds for transfer");
       }
    }
}



