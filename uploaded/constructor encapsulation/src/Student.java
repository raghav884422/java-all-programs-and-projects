

public class Student {
	private int id;
	private String name;
	private int marks;
	
	public Student(int a, String b, int c) {
		if (a>0) {
			id = a ;
			
		}
	if(b.length()!=0) {
			name = b ;
	}
		
		if(c>0) {
			marks=c;
		}
	}
	
	public Student(Student student) {
		super();
		
	}
	
	
	
	
	public void study() {
		System.out.println(name+"student is studding");
}
}