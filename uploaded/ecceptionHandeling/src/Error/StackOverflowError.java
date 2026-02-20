package Error;

public class StackOverflowError {
   public static void display() {
	   System.out.println("hello");
	   display();
   }
   public static void main(String[] args) {
	StackOverflowError.display();
}
}
