package singletonDesignPattern;

public class PrimeMinsterApp {
   public static void main(String[] args) {
	Priminster pm1=Priminster.getInstance("Modi", "BJP", 72, 2);
	System.out.println(pm1);
	Priminster pm2=Priminster.getInstance("rahul gandhi", "Congress", 62, 1);
	System.out.println(pm2);
	
}
}
