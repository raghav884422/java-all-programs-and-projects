
public class casioclaculator implements calculator{
int a=30;
int b=10;

	@Override
	public void add() {
		int c = a+b;
		System.out.println(c);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int c = a-b;
		System.out.println(c);
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int c = a*b;
		System.out.println(c);
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		
		int c = a/b;
		System.out.println(c);
	}
	

}
