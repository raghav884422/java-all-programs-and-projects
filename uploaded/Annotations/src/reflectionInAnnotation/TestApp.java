package reflectionInAnnotation;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TestApp {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
     Class<?>cls = Class.forName("reflectionInAnnotation.kodnestApp");
     Object ref = cls.getDeclaredConstructor().newInstance();
     Field f = cls.getDeclaredField("username");
     validate v = f.getAnnotation(validate.class);
     System.out.println("Min "+v.min());
     System.out.println("Max "+v.max());
     System.out.println("Message "+v.message());
     
     
	}
}
