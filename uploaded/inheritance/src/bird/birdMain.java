package bird;

public class birdMain {
 public static void main(String[] args) {
	eagle e = new eagle();
	e.name="ram";
	e.habital="carnivorus";
	e.eat();
	e.hunt();
	goldenEgale eg = new goldenEgale();
	eg.name="kingfisher";
	eg.habital="mountain";
	eg.foodType="king of good times";
	eg.eat();
	eg.hunt();
	eg.foodHabbit();
	goldenSparrow gs = new goldenSparrow();
	gs.name="shyam";
	gs.place="mountain";
	gs.foodType="non veg";
	gs.eat();
	gs.pick();
	gs.foodHabbit();
 }

}
