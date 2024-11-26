import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author USER
 */
class Employee {
    int empId;
    String empName;
    int joiningYear;

    public Employee(int empId, String empName, int joiningYear) {
        this.empId = empId;
        this.empName = empName;
        this.joiningYear = joiningYear;
    }

    @Override
    public String toString() {
        return empName + " (" + joiningYear + ")";
    }
}

public class Lab2_Task3 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Faiz", 2019));
        employees.add(new Employee(2, "Haris", 2018));
        employees.add(new Employee(3, "Ayesha", 2020));

        // Sort by joining year
        employees.sort(Comparator.comparingInt(e -> e.joiningYear));

        System.out.println("Employees sorted by joining year: " + employees);
    }
}