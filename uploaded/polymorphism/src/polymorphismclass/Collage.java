package polymorphismclass;

public class Collage {
	public static void accept(Teacher ref) {
		ref.markAttendence();
		ref.teach();
	}
	
//   this is non static mathod for final case we make the static mathod
	
//	public void accept(Teacher ref) {
//		ref.markAttendence();
//		ref.teach();
//	}


}
