package Com.Company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashSet<String> hs=new HashSet<>();
        hs.add("madhu");
        hs.add("dhanu");
        hs.add("eswar");
        hs.add("naidu");
        hs.add("nutan");

        System.out.println("Original");
        System.out.println(hs);
        System.out.println(hs.size());

        hs.add("madhu");
        hs.add("kailash");

        System.out.println("After adding duplicate elements");
        System.out.println(hs);
        System.out.println(hs.size());
    }
}
