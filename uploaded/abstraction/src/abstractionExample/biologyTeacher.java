package abstractionExample;

public class biologyTeacher extends Teacher {
	   String name;
		void markAttendence() {
	    	  System.out.println(name+ " biology teacher is marking attendence.");
	      }
	      void teach() {
	    	  System.out.println(name +" bioloogy teacher is teaching biology.");
	      }
		public biologyTeacher(String name) {
			super();
			this.name = name;
		}

}
