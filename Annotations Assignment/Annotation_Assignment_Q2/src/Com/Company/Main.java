package Com.Company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class Main {

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE, ElementType.PARAMETER, ElementType.METHOD})

    @interface Info{
        int AuthorID();
        String Author() default "max";
        String Supervisor() default "muller";
        String Date();
        String Time();
        int version();
        String description() default "Displaying Method";
    }

    public static void main(String[] args) throws NoSuchMethodException {
	// write your code here
        Developer developer = new Developer();
        Method m=developer.getClass().getMethod("displayMethod");

        Info d1 = m.getAnnotation(Info.class);
        System.out.println("Author ID is: "+d1.AuthorID());
        System.out.println("Author Name is: "+d1.Author());
        System.out.println("Supervisor is: "+d1.Supervisor());
    }
}
