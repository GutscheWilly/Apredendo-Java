package services;

public class BrazilInterestService implements InterestService {
    
    private final Double interestRate = 0.02;

    @Override
    public Double getInterestRate() {
        return interestRate;
    }
}
