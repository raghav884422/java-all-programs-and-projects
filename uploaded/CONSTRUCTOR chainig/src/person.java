
public class person {
	String name;
	int age;
	public person(String name,int age ) {
		this();
		System.out.println("presonr parameter constructor exicuetd");
		this.name = name;
		this.age = age;
	}
public person() {
	System.out.println("person zero parameter constructor exicuted");
	name = "raja";
	age = 25;
}
}
