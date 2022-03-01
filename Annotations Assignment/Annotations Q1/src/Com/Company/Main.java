package Com.Company;

import java.lang.annotation.Annotation;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Authors obj = new Authors("Max","Maddy","This is a sample for annotations");
        System.out.println("the name of author is: "+ obj.Author + " the supervisor is: " + obj.Supervisor + " desc: " + obj.Description);

        Class c = obj.getClass();
        Annotation an = c.getAnnotation(Info.class);
        Info I = (Info)an;
        System.out.println(I.AuthorId());
    }
}
