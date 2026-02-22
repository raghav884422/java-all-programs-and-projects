package encapsulastion;

public class Student {
private int id;
private String name;
private int marks;

public void setId(int a) {
if (a>0) {
	id = a;
}
else {
    id=0;
	System.out.println("invailid input");
}}

public int getId() {
	return id;

}



public void setmark(int c) {
if (c>0) {
	marks = c;
}
else {
	marks =0;
	System.out.println("invailid input");
}}

public int getMarks() {
	return marks;

}
public void setName(String b) {
 name=b;
}

public String getName() {
	return name;

}


}
