package classQuestion;

public class classApp {
	public static void main(String[] args) {
		Greeter greet = () -> System.out.println("hello word");
		greet.greet();
		Display dis = (name) -> System.out.println(name+"❤️ utkarsh");
		dis.display("muskan");
	}

}
