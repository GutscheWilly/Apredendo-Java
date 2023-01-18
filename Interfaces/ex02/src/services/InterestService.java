package services;

import java.security.InvalidParameterException;

public interface InterestService {
    
    Double getInterestRate();

    default Double payment(Double amount, Integer months) {
        if (!validateMonths(months)) {
            throw new InvalidParameterException("Months are not valid! They must be at least 1!");
        }
        return amount * Math.pow(1 + getInterestRate(), months);
    }

    private boolean validateMonths(Integer months) {
        return months > 0;
    }
}
