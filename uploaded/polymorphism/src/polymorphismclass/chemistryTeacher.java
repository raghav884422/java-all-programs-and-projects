package polymorphismclass;

public class chemistryTeacher extends Teacher {
	

    public chemistryTeacher(String name) {
	this.name = name;
	}



void markAttendence() {
	System.out.println(name+"  chemistry teacher is marking attendence");
}

	void teach() {
	System.out.println(name+"  chemistry teacher is teaching.");
	
	}

}
