package entities;

public class Company extends TaxPayer {
    
    private Integer numberOfEmployees;

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public final Double tax() {
        Double tax;
        if (numberOfEmployees > 10) {
            tax = 0.14 * getAnualIncome();
        } else {
            tax = 0.16 * getAnualIncome();
        }
        return tax;
    }
}
