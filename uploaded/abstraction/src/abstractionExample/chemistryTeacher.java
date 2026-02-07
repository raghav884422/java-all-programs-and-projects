package abstractionExample;

public class chemistryTeacher extends Teacher {
	   String name;
		void markAttendence() {
	    	  System.out.println(name+ " chemistry teacher is marking attendence.");
	      }
		void teach() {
	    	  System.out.println(name +" chemistry teacher is teaching chemistry.");
	      }
		public chemistryTeacher(String name) {
			super();
			this.name = name;
		}

}
