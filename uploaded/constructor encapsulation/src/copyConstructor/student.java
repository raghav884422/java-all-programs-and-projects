package copyConstructor;
public class student {
	private int id;
	private int marks;
	private String name;
	public student(int id, int marks,String name) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		
	}
	//copy constructor:====
	public student(student ref) {
		this.id=ref.id;
		this.marks= ref.marks;
		this.name = ref.name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println(id+" " + marks+" " + name);
	}
	
	
}