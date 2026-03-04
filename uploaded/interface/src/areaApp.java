import interfaceConclusion.Circle;
import interfaceConclusion.Geometry;
import interfaceConclusion.Ractangle;
import interfaceConclusion.cylinder;
import interfaceConclusion.square;
import interfaceConclusion.triangle;

public class areaApp {
public static void main(String[] args) {
         Geometry.accept(new Circle());
         Geometry.accept(new square());
         Geometry.accept(new Ractangle());
         Geometry.accept(new triangle()); 
         Geometry.accept(new cylinder());
         
}
}
