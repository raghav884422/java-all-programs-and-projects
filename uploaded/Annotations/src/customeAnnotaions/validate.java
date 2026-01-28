package customeAnnotaions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//@Target(ElementType.TYPE)
//@Target(ElementType.FIELD)
public @interface validate {
	String message();
	int Min();
	int Max();
}
