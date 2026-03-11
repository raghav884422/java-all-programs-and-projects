package mathodinheritance;

public class teacherapp {
	public static void main(String[] args) {
		physicsTeacher py = new physicsTeacher();
		py.name = "ram";
		py.markAttendence();
		py.lawsExp();
		py.teach();
		chemistryTeacher ch = new chemistryTeacher();
		ch.name = "chadni";
		ch.markAttendence();
		ch.doChemicalExp();
		ch.teach();
		
		bioTeacher bi = new bioTeacher();
		bi.name = "susmita";
		bi.markAttendence();
		bi.disectionExp();
		bi.teach();
	}

}
