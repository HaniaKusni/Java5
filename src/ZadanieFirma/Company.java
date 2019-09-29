package ZadanieFirma;

import java.util.List;

public class Company {
    public String companyName;
    public List<Worker> workers;
    public Company(String companyName) {
        this.companyName = companyName;
    }
}
