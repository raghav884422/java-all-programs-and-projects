package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class EmployeeApp {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
//	this is called reflection and we can create the object of class without using new keyword
	
	Class<?> cls = Class.forName("reflection.Employee");
	Object obj = cls.getDeclaredConstructor().newInstance(); 
	Method m = cls.getDeclaredMethod("greet");
	m.invoke(obj);
//	 this is for private method 
	Method m2 = cls.getDeclaredMethod("greet2");
	m2.setAccessible(true);
	m2.invoke(obj);
}
}
