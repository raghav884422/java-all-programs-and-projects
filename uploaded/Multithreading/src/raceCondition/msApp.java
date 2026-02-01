package raceCondition;

public class msApp {
public static void main(String[] args) {
	MsWorld t1 = new MsWorld();
	MsWorld t2 = new MsWorld();
	MsWorld t3 = new MsWorld();
    t1.setName("type");
    t2.setName("spelling");
    t3.setName("save");
    t1.start();
    t2.start();
    t3.start();
}
}
