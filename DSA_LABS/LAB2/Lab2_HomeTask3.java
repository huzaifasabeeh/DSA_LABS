import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author USER
 */
class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ")";
    }
}

public class Lab2_HomeTask3 {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();

        employees.add(new Employee("Faiz", 101));
        employees.add(new Employee("Ashar", 102));
        employees.add(new Employee("Arham", 101)); // Duplicate entry

        System.out.println("Employees: " + employees);
    }
}