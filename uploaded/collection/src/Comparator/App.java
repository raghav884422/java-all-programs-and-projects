package Comparator;

public class App {
	public static void main(String[] args) {
		Employee e1 = new Employee(11, "Rajiv", 98000);
		Employee e2 = new Employee(12, "shyam", 66000);
		Employee e3 = new Employee(13, "mohan", 74000);
		Employee e4 = new Employee(14, "Sohan", 82000);
		Employee e5 = new Employee(15, "mukund", 570000);
		compareSalary cs = new compareSalary();
		int result1 = cs.compare(e1, e2);
		if(result1>0) {
			System.out.println(e1+"Is greater in salary");
		}
		else {
			System.out.println(e2+"Is greater in salary");
		}
		compareName cn = new compareName();
		int result2 =cn.compare(e4, e5);
		if(result2>0) {
			System.out.println(e4+"Is greater in name");
		}
		else {
			System.out.println(e5+"Is greater in name");
		}
		
		compareId cid = new compareId();
		int result3 =cid.compare(e3, e4);
		if(result3>0) {
			System.out.println(e3+"Is greater in id");
		}
		else {
			System.out.println(e4+"Is greater in id");
		}
	}

}
