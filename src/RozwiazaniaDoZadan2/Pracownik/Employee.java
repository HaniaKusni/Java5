package RozwiazaniaDoZadan2.Pracownik;

import java.math.BigDecimal;

public class Employee {
    private String firstName;
    private String lastName;
    private BigDecimal salary;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public BigDecimal getSalary() {
        return salary;
    }
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}