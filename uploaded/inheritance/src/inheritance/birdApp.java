package inheritance;

public class birdApp {
	public static void main(String[] args) {
	      mountainEagle m = new mountainEagle();
	      m.name = "muskan ";
	      m.age = 21;
	      m.sleep();
	      m.eat();
	      m.fly();
	      serpantsEagle s = new serpantsEagle();
	      s.name = "shivi ";
	      s.age = 22;
	      s.sleep();
	      s.eat();
	      s.fly();
	      vegSparrow v = new vegSparrow();
	      v.name = "utkash ";
	      v.age = 18;
	      v.sleep();
	      v.eat();
	      v.fly();
	      nonvegSparrow n = new nonvegSparrow();
	      n.name = "utkash";
	      n.age = 18;
	      n.sleep();
	      n.eat();
	      n.fly();
	}

}
