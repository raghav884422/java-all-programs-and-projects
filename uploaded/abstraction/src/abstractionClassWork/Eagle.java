package abstractionClassWork;

public abstract class Eagle extends Bird {
	String name;
	
   public Eagle(String name) {
		super();
		this.name = name;
	}

void fly() {
	   System.out.println(name+"bird is flying.");
   }

}
