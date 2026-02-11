package haseCodeOverridenmathod;

import java.util.HashSet;

public class studentApp {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name="ram";
		s1.rollNumber = 101;
		s1.introduce();
		System.out.println(s1);
		Student s2 = new Student();
		s2.name="ram";
		s2.rollNumber = 101;
		s2.introduce();
		System.out.println(s1);
		System.out.println(s1==s2);
		
		HashSet<Student> hs = new HashSet<Student>();
		hs.add(s1);
		hs.add(s2);
		System.out.println(hs);

		
	}

}
