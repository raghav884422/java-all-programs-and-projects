package polymorphismclass;

import java.rmi.MarshalException;

public class physicsTeacher extends Teacher {

	
public physicsTeacher(String name) {
	this.name=name;
	}

void markAttendence() {
	System.out.println(name+"  physics teacher is marking attendence");
}

	void teach() {
	System.out.println(name+"  physics teacher is teaching.");
	
	}
	

}
