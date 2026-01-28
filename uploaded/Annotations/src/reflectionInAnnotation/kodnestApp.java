package reflectionInAnnotation;

public class kodnestApp {
	@validate(min = 5,max = 500,message = "performing validation for user")
String username;
public void greet() {
	System.out.println("Hello Sir.....");
}
}
