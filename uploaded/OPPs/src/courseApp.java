import java.time.Duration;

public class courseApp {
	public static void main(String[] args) {
		course c1 = new course();
		c1.id =123;
		c1.name="ram";
		c1.mentor ="punith sir";
		c1.Duration = 3;
		c1.Start();
		c1.learn();
		c1.end();
		System.out.println(c1.id);
		System.out.println(c1.name);
		System.out.println(c1.id);	
		System.out.println(c1.mentor);
		System.out.println(c1.Duration);
	}

}
