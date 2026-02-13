

public class studenapp {
public static void main(String[] args) {
	Student s1 = new Student(5, "ram", 45);
	Student s2 = new Student(51, "rama", 48);
//	System.out.println("id "+s1.getId()+"marks: "+s1.getMarks()+"name: "+s1.getName());
//	System.out.println("id "+s2.getId()+"marks: "+s2.getMarks()+"name: "+s2.getName());

	Student s3= new Student(s2);
}
}
