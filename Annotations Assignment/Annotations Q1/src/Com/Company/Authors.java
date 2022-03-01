package Com.Company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

@interface Info{
    int AuthorId() default 100;
    String Date() default "Sunday";
    String Time() default "Afternoon";
    int Version() default 1;

}
@Info(AuthorId = 120,Date = "Monday",Time = "Morning",Version = 6)

public class Authors {
    String Author;
    String Supervisor;
    String Description;

    public Authors(String author, String supervisor, String description) {
        this.Author = author;
        this.Supervisor = supervisor;
        this.Description = description;
    }
}
