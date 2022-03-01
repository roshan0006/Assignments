package Com.Company;

public class Employee {
    int id;
    String name;
    int salary;
    String department;
    String displayDetails;

    public Employee(int id, String name, int salary, String department, String displayDetails) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.displayDetails = displayDetails;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDisplayDetails(String displayDetails) {
        this.displayDetails = displayDetails;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getDisplayDetails() {
        return displayDetails;
    }
    public String toString(){
        return "Employees[empid=" + id + ",empSalary=" + salary + ",empname=" + name + ",empdept=" + department + ",empage =" + displayDetails + "]";
    }
}
