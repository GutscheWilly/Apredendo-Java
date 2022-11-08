package entities.worker.compositions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HourContract {
    
    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;
    
    public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double totalValue() {
        return valuePerHour * hours;
    }

    public String toString() {
        return String.format("Date: " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\nValue per horus: %.2f R$\nHours: %d", valuePerHour, hours);
    }
}
