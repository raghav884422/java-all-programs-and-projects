package polymorphismclass;

public class teacherApp {
	public static void main(String[] args) {
		
//		this is the proper utilisation of polymoephism and we can direct call the mathod
//		because we make the mathod static so we dont need to creat the object
		Collage.accept(new physicsTeacher("mohan"));
		Collage.accept(new chemistryTeacher("kalpana"));
		Collage.accept(new biologyTeacher("dipendra sir"));  // making another class at last

		
		
//		when we make the mathod nopn static so that wo can creat the object 
//		and then we pwerform polymorphism.
//		Collage collage = new Collage();
//		collage.accept(new physicsTeacher("mohan"));
//		collage.accept(new chemistryTeacher("kalpana"));

		
		
//		This is in a polymorphism but we can reduce it more 
//		Collage collage = new Collage();
//         physicsTeacher phys = new physicsTeacher("mohan");
//         chemistryTeacher chem = new chemistryTeacher("kalpana");
//          collage.accept(chem);         
//          collage.accept(phys);
//		
		
		
//		another approch by usnig upcasting:==
//		it is an polymorphic code but we are not taking advantage of it.
		
//		physicsTeacher phys = new physicsTeacher("mohan");
//		Teacher ref;
//		ref=phys;
//		ref.markAttendence();
//		ref.teach();
//		chemistryTeacher chem = new chemistryTeacher("kalpana");
//		ref = chem;
//		ref.markAttendence();
//		ref.teach();
		
		
		
		
		
		
		
//		this is the noram approch:=
		
//		physicsTeacher phys = new physicsTeacher("mohan");
//		phys.markAttendence();
//		phys.teach();
//		chemistryTeacher chem = new chemistryTeacher("kalpana");
//		chem.markAttendence();
//		chem.teach();
	}

}
