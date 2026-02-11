package hashsetOverride;

import java.util.HashSet;
import java.util.Scanner;

public class CarApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Car> hs = new HashSet<Car>();
		for(int i =1;i<=n;i++) {
		String model=sc.next();
		int year =sc.nextInt();
		Car car = new Car(model, year);
		hs.add(car);
			
		}
		System.out.println(hs);
	}

}
