import java.util.Scanner;

public class eclionCalculator implements calculator {
	
	Scanner scan = new Scanner(System.in);
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Enter the two number that you want to add: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a+b;
		System.out.println(c);
	}
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Enter the two number that you want to subtract: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a-b;
		System.out.println(c);
		
	}
	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("Enter the two number that you want to multiply: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a*b;
		System.out.println(c);
	}
	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("Enter the two number that you want to divide: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
      if (b!=0) {
		int c = a/b;
		System.out.println(c);
      }
      else {
    	  System.out.println("invaild input");
      }
		
	}
	
	

}
