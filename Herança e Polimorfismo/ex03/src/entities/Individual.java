package entities;

public class Individual extends TaxPayer {
    
    private Double healthExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public final Double tax() {
        Double tax;
        if (getAnualIncome() >= 20000) {
            tax = 0.25 * getAnualIncome();
        } else {
            tax = 0.15 * getAnualIncome();
        }
        if (healthExpenditures > 0) {
            tax -= 0.5 * healthExpenditures;
        }
        return tax;
    }
}
