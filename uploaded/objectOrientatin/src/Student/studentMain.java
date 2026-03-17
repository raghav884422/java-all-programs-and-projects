package Student;

public class studentMain {
	public static void main(final String[] args) {
		final Student S1 = new Student();
		final Student S2 = new Student();
		
		S1.id=11;
		S1.name="ram";
		S1.branch= "CSE";	

		S2.id=11;
		S2.name="ram";
		S2.branch= "CSE";	
	S1.study();
	S2.wakeUp();
	System.out.println(S1.branch);
	System.out.println(S1.id);
	System.out.println(S1.branch);
	System.out.println(S1.id);
	System.out.println(S1.name);
	
	}

}
