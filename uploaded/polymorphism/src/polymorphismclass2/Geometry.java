package polymorphismclass2;

public class Geometry {
	public static void accept(Shape ref) {
		ref.acceptInput();
		ref.calculateArea();
		ref.displayArea();
	
	}

}
