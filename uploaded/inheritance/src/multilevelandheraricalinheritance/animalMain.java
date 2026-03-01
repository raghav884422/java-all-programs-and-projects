package multilevelandheraricalinheritance;

public class animalMain {
	public static void main(String[] args) {
		tiger t = new tiger();
		t.name="raju";
		t.habital = "jungli";
		t.eat();
		t.hunt();
		
		deer d = new deer();
		d.name="hiran";
		d.habital = "tiger food";
		d.eat();
		d.grace();
		
		monkey m = new monkey();
		m.name="aakash";
		m.place = "jharkhand";
		m.eat();
		m.steal();
	}

}
