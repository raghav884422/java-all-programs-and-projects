package polymorphismclass;

public class biologyTeacher extends Teacher {
	

    public biologyTeacher(String name) {
	this.name = name;
	}


@Override
void markAttendence() {
	System.out.println(name+"  biology teacher is marking attendence");
}
@Override
	void teach() {
	System.out.println(name+"  biology teacher is teaching.");
	
	}
}