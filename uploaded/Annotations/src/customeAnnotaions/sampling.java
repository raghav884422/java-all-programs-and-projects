package customeAnnotaions;

public class sampling {
//	
	int c = 10;
	@validate(message = "jyoti",Min = 50,Max = 100)

	void validateAge(int age) {
		System.out.println("Age is " + age);
	}
}
