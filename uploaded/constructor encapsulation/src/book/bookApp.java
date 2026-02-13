package book;

public class bookApp {
public static void main(String[] args) {
	book original = new book("java book ",200);
	
	book copied = new book(original);
	copied.pages=500000;
	copied.title= "raja ram mohan roy ";
	original.displayDetails();
	copied.displayDetails();
}
}
