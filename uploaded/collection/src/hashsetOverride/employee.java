package hashsetOverride;

public class employee {
	int id;
	String name;
//	int salary;
	
	

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
//	public int getSalary() {
//		return salary;
//	}
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}

	public employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
//		this.salary = salary;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj)
			return true;
		if(obj== null ||getClass()!=obj.getClass())
			return false;
		employee e = (employee) obj;
		return id == e.id && name.equals(e.name);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name,id);
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
