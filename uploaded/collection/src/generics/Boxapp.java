package generics;

public class Boxapp {
public static void main(String[] args) {
	Box<String> stringBox= new Box<String>();
	stringBox.setItem("TextBook");
	System.out.println("Item is "+stringBox.getItem());

	Box<Integer> IntBox= new Box<Integer>();
	IntBox.setItem(101);
	System.out.println("Integer item is "+IntBox.getItem());

}
}
