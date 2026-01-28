package reflection;

public class Employee {
	String name;

	void greet() {
   System.out.println("hello sir....");
	}
	@SuppressWarnings("unused")
	private void greet2() {
		System.out.println("hello madem....");
	}
	public Employee(String name) {
		super();
		this.name = name;
	}
}
