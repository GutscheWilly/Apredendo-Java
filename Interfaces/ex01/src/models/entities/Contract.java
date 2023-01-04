package models.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Contract {
    
    private Integer number;
    private LocalDate date;
    private Double totalValue;
    private List<Installment> listOfInstallments;

    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public List<Installment> getListOfInstallments() {
        return listOfInstallments;
    }

    public void setListOfInstallments(List<Installment> listOfInstallments) {
        this.listOfInstallments = listOfInstallments;
    }

    @Override
    public String toString() {
        return String.format("Number: " + number +
        "\nDate: " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
        "\nTotal value: $" + totalValue + "\n" +
        provideInstallmentsInString());
    }

    public String provideInstallmentsInString() {
        StringBuilder string = new StringBuilder();
        string.append("Installments:");
        
        for (Installment installment : listOfInstallments) {
            string.append("\n" + installment.getDueDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - " + installment.getAmount());
        }

        return string.toString();
    }
}
