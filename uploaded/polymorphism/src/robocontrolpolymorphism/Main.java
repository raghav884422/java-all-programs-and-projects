package robocontrolpolymorphism;

public class Main {
    public static void main(String[] args) {
        Robot robo = new Robot();
         operateRobo(robo);  
        Robot robo2 = new Robot();
         operateRobo(robo2);
    }

	public static void operateRobo(Robot robo) {
		robo.learn();
		robo.charge();
		robo.tasks();
	}

}
