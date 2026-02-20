package tryAndCatchExample;

public class multipleExceprionHandeling {
public static void main(String[] args) {
	String [] number = {"10","20","thirty","40"};
	int sum = 0;
	for(String num : number)
	{
		try {
			sum +=Integer.parseInt(num);
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("invalid number input format "+num);
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("encounter the null value ");
		}
	}
	System.out.println("total sum : "+ sum);
}
}
