package copyConstructor;

public class studentApp {
	public static void main(String[] args) {
		student s1 = new student(123, 45, "raghav");
		
	System.out.println("id :"+s1.getId()+"   name:"+s1.getName()+"   marks:"+s1.getMarks());
	
	
	student copy = new student(s1); 
	System.out.println("id: "+copy.getId()+" marks: "+copy.getMarks()+"   name: "+copy.getName());
	s1.setId(5);
	s1.setMarks(99);
	s1.setName("Akash is at home.");
     copy.display();
	}

}
