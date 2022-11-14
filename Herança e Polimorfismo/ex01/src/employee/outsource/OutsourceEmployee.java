package employee.outsource;

import employee.Employee;

public class OutsourceEmployee extends Employee {
    
    private Double addicionalCharge;

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double addicionalCharge) {
        super(name, hours, valuePerHour);
        this.addicionalCharge = addicionalCharge;
    }

    public Double getAddicionalCharge() {
        return addicionalCharge;
    }

    public void setAddicionalCharge(Double addicionalCharge) {
        this.addicionalCharge = addicionalCharge;
    }

    @Override
    public final Double payment() {
        return super.payment() + (1.1 * addicionalCharge);
    }
}
