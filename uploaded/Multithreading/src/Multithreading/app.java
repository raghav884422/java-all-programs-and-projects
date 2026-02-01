package Multithreading;

public class app {
public static void main(String[] args) {
	banking1 b = new banking1();
	printing p = new printing();
	addition a  = new addition();
	b.start();
	p.start();
	a.start();
}
}
