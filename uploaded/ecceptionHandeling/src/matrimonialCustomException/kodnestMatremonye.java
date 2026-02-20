package matrimonialCustomException;

public class kodnestMatremonye {

	Applicant ap = new Applicant();

	void initiate() {
		try {
	     ap.takeInput();
	     ap.validate();
		}
		catch (Exception e) {
			// TODO: handle exception
//			three time chace to try 
           try {
        	   ap.takeInput();
        	   ap.validate();
		} catch (Exception e1) {
			// TODO: handle exception
			try {
				ap.takeInput();
				ap.validate();
			}catch (Exception e2) {
				// TODO: handle exception
				System.out.println("jab bola nahi hai eligible toh maa kyo chuda raha yaha ");
			}
			
		}
	}
	}
}
