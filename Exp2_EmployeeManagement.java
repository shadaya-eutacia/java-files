abstract class Employee {
    static String company = "TechCorp";
    public String department;
    private double salary;
    protected String designation;
    String location;

    public Employee(String department, double salary, String designation, String location) {
        this.department = department;
        this.salary = salary;
        this.designation = designation;
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void displayRole();
}

class Developer extends Employee {
    public Developer(String department, double salary, String designation, String location) {
        super(department, salary, designation, location);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Software Developer - Writes and maintains code.");
    }
}

public class Exp2_EmployeeManagement {
    public static void main(String[] args) {
        Developer dev = new Developer("Engineering", 85000.00, "Senior Developer", "New York");

        System.out.println("Company: " + Employee.company);
        System.out.println("Department: " + dev.department);
        System.out.println("Designation: " + dev.designation);
        System.out.println("Location: " + dev.location);
        System.out.println("Salary: $" + dev.getSalary());
        
        dev.displayRole();
    }
}

