package buildinAnnotaions;

public class demo extends sample {
   @Override
   public void display() {
	   System.out.println("hello..hello");
   }
   @Override
   @Deprecated
   public void display2() {
	   System.out.println("hello world");
   }
}
