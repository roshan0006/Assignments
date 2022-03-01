package Com.Company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Generic<String, String> ob1=new Generic<>();
        ob1.setKey("1");
        ob1.setValue("Hey There!");
        Generic<String, java.util.Date> ob2=new Generic<>();
        ob2.setKey("Today is");
        ob2.setValue(new java.util.Date());
        System.out.println(ob1.getKey()+" "+ob1.getValue());
        System.out.println(ob2.getKey()+" "+ob2.getValue());
    }
}
