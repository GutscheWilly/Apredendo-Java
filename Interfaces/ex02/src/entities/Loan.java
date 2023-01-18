package entities;

public class Loan {
    
    private Double amount;
    private Integer months;

    public Loan(Double amount, Integer months) {
        this.amount = amount;
        this.months = months;
    }

    public Double getAmount() {
        return amount;
    }

    public Integer getMonths() {
        return months;
    }
}
