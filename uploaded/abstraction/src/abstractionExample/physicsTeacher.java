package abstractionExample;

public class physicsTeacher extends Teacher {
       String name;
	void markAttendence() {
    	  System.out.println(name+ " physic teacher is marking attendence.");
      }
      void teach() {
    	  System.out.println(name +" physics teacher is teaching physics.");
      }
	public physicsTeacher(String name) {

		this.name = name;
	}
      
}
