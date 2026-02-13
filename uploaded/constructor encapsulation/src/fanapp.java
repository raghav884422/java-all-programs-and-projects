

public class fanapp {
	public static void main(String[] args) {
		fan f1 = new fan(4,"a","red");
		System.out.println(f1.brand+" "+f1.colour+" "+f1.numberOfWings);
		fan f2 = new fan();
		System.out.println(f2.brand+" "+f2.colour+" "+f2.numberOfWings);
	}

}
