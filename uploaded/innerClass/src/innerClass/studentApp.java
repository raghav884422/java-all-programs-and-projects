package innerClass;

public class studentApp {
public static void main(String[] args) {
	Student student = new Student();
	student.setId(1234);
	student.setName("Raghav");
	student.setAge(12);
	
//  non static inner class 	

//	Student.Address address =new Student();
	
	Student.Address address = new Student.Address();
	
	address.setHouseNo(50);
    address.setLandmark("4th floor near relince");
    address.setCity("banglore");
    address.setState("karnatak");
    address.setPincode(485771);
    
    
    
    student.setAddress(address);
    System.out.println(student.getName()+" "+student.getId()+" "+student.getAge());
    System.out.println(student.address.getHouseNo()+" "+student.address.getCity()+" "+ student.address.getLandmark()+student.address.getState());
    System.out.println(student.getAddress());
}
}
