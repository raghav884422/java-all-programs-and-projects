package encapsulastion;

public class stdentMain {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(2);
		System.out.println(s.getId());
		s.setmark(5);
		System.out.println(s.getMarks());
		s.setName("raghav");
		System.out.println(s.getName());
	}

}
