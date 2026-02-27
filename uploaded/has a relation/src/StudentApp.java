
public class StudentApp {
	public static void main(String[] args) {
		student s = new student("Ram",22,98);
		System.out.println("Student details: "+s.name+s.marks+s.age);
		System.out.println("Heart details: " +s.h.colour+"  "+s.h.weight);
		s.h.heart();
		book b = new book("atomic habit", "stefen",500);
		s.ref = b;
		System.out.println("Book details: "+b.name+" "+b.author+" "+b.cost );
		s.ref.book();
//		s=null;
//		System.out.println("Student details: "+s.name+s.marks+s.age);
//		System.out.println("Heart details: " +s.h.colour+"  "+s.h.weight);
// if we make student null than garbage collector will take all 		
	}

}
