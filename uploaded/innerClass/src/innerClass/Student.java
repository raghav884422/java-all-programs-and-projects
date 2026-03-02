package innerClass;

public class Student {
	int id;
    String name;
    int age;
// inner class
    //	class Address {
    
    
    static class Address{
    	
    	int houseNo;
    	String streetName;
    	String landmark;
    	String city;
    	String state;
    	int pincode;
		public int getHouseNo() {
			return houseNo;
		}
		public void setHouseNo(int houseNo) {
			this.houseNo = houseNo;
		}
		public String getStreetName() {
			return streetName;
		}
		public void setStreetName(String streetName) {
			this.streetName = streetName;
		}
		public String getLandmark() {
			return landmark;
		}
		public void setLandmark(String landmark) {
			this.landmark = landmark;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
    }
	Address address;
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	void displayStudentMarks() {
		class Marks {
			int m1;
			int m2;
			int m3;
			void displaydetails(){
				System.out.println(m1+" "+ m2+" "+m3);
			}
		}
		Marks m = new Marks();
		m.m1= 15;
		m.m2=99;
		m.m3=100;
		m.displaydetails();
	}


	

}
