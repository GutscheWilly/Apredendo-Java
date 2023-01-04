package models.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import models.entities.Contract;
import models.entities.Installment;

public class ContractService {
    
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        List<Installment> listOfInstallments = new ArrayList<>();

        for (int currentMonth = 1 ; currentMonth <= months ; currentMonth++) {
            LocalDate installmentDate = provideInstallmentDate(contract.getDate(), currentMonth);
            Double installmentAmount = provideInstallmentAmount(contract.getTotalValue(), months, currentMonth);
            Installment currentInstallment = new Installment(installmentDate, installmentAmount);
            listOfInstallments.add(currentInstallment);
        }

        contract.setListOfInstallments(listOfInstallments);
    }

    private LocalDate provideInstallmentDate(LocalDate date, Integer months) {
        return date.plusMonths(months);
    }

    private Double provideInstallmentAmount(Double totalValueOfContract, Integer months, Integer currentMonth) {
        Double installment = totalValueOfContract / months;
        Double interest = onlinePaymentService.interest(installment, currentMonth);
        Double paymentFee = onlinePaymentService.paymentFee(installment + interest);
        return installment + interest + paymentFee;
    }
}
