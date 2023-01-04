package models.services;

public class PaypalService implements OnlinePaymentService {

    private Double paymentTax;
    private Double interestTax;

    public PaypalService() {
        paymentTax = 0.02;
        interestTax = 0.01;
    }
    
    @Override
    public Double paymentFee(Double amount) {
        return amount * paymentTax;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return amount * months * interestTax;
    }
}
