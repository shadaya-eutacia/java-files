import java.io.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    
    int empId;
    String name;
    transient double salary; // 'transient' fields are NOT saved during serialization

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Salary: " + salary);
    }
}

public class Exp15_SerializationDemo {
    public static void main(String[] args) {
        String filepath = "employee.ser";
        Employee emp = new Employee(501, "Sarah Jenkins", 75000.0);

        // 1. Serialization (Saving object state to a file)
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filepath))) {
            oos.writeObject(emp);
            System.out.println("Object Serialized Successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Deserialization (Restoring object state from the file)
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath))) {
            Employee deserializedEmp = (Employee) ois.readObject();
            System.out.println("\n--- Deserialized Object Data ---");
            deserializedEmp.display(); 
            // Note: Salary will show 0.0 because it was marked as 'transient'
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}