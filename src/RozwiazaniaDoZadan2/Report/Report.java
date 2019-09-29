package RozwiazaniaDoZadan2.Report;

import ZadaniaSolid2.Pracownik.Employee;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Report {
    public void print() {
        List<Employee> employees = getEmployees();
        header();
        separator();
        printEmployees(employees);
        separator();
    }
    private void header() {
        System.out.println("Report | Date: " + LocalDateTime.now());
    }
    private void separator() {
        System.out.println("######################################");
    }
    private void printEmployees(List<Employee> employees) {
        for (Employee e : employees) {
            System.out.println("First name: " + e.getFirstName());
            System.out.println("Last name: " + e.getLastName());
            System.out.println("Salary: " + e.getSalary());
        }
    }
    private List<Employee> getEmployees() {
        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setLastName("Smith");
        employee.setSalary(new BigDecimal(500));
        return Arrays.asList(employee);
    }
}
