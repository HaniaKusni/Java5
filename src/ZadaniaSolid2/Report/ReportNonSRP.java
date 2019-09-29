package ZadaniaSolid2.Report;



import ZadaniaSolid2.Pracownik.Employee;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class ReportNonSRP {


    public void print() {
        List<Employee> employees = getEmployees();
        System.out.println("Report | Date: " + LocalDateTime.now());
        System.out.println("#####################################");
        for (Employee e : employees) {
            System.out.println("First name: " + e.getFirstName());
            System.out.println("Last name: " + e.getLastName());
            System.out.println("Salary: " + e.getSalary());
        }
        System.out.println("#####################################");
    }
    private List<Employee> getEmployees() {
        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setLastName("Smith");
        employee.setSalary(new BigDecimal(500));
        return Arrays.asList(employee);
    }
}
