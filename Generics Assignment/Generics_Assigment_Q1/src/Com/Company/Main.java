package Com.Company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee e1= new Employee(142,"Alex",50000,"IT","Age:26");
        Employee e2= new Employee(143,"Max",60000,"Management","Age:21");
        Employee e3= new Employee(144,"Muller",70000,"Business","Age:27");
        Set<Employee> employees=new HashSet<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        for (Employee employee2 : employees) {
            System.out.println(employee2.toString());
        }
    }
}
