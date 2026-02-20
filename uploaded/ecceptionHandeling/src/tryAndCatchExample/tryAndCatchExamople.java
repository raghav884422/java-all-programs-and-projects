package tryAndCatchExample;

public class tryAndCatchExamople {
public static void main(String[] args) {
	int a=10;
	int b= 0;
	try {
		
		int result = a/b;
		System.out.println(result);
	} catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("oops! you we can not divide it please provide the proper input");
	}
	System.out.println("program runs smoothly");
}
}
