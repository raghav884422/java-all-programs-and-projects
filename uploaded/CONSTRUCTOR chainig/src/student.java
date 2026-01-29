
public class student extends person {
	int marks;
	String collage;
public student() {
	super ("rahul",20);
		System.out.println("student zero parameterised constructoe");
		marks= 35;
		collage = "UCVE";
		
		}
public student(int marks) {
	this();
	System.out.println("single parameterised constructor excueted");
	this.marks= marks;
	collage = "kodnest";
}
public student(int marks, String collage) {
	this(95);
	System.out.println("student 2 parameter constructoe exicuted");
	this.marks = marks;
	this.collage=collage;
	}

}
