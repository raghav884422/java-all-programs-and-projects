package interfacequestion;

public class testoperation { 
	public static void testBankOperations(BankService bank, double deposit, double withdraw, double transfer, String transferTo) {
    bank.deposit(deposit);
    bank.withdraw(withdraw);
    bank.checkBalance();
    bank.transfer(transfer, transferTo);
    }
}
