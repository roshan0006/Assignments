package Com.Company;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TreeMap<Long,String> contact=new TreeMap<>();
        contact.put((long) 709500179, "max");
        contact.put((long) 810601864, "muller");
        contact.put((long) 799580161, "Edward");
        contact.put((long) 630349339, "Neil");
        System.out.println(contact.keySet());
        System.out.println(contact.values());
        System.out.println(contact);
    }
}
