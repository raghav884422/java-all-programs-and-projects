package interfacequestion;


	public class mainapp {
	    public static void main(String[] args) {
	    BankService citiBank = new CitiBank();
	    BankService chaseBank = new ChaseBank();
	    testoperation.testBankOperations(citiBank, 500, 300, 100, "12345ABC");
	    testoperation.testBankOperations(chaseBank, 500, 300, 100, "12345DEF");
	    }
	}
