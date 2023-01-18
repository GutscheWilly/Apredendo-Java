import java.util.Scanner;

import entities.Loan;
import services.BrazilInterestService;
import services.InterestService;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner((System.in));
        Loan loan = requestLoan(scanner);
        InterestService interestService = new BrazilInterestService();
        Double payment = interestService.payment(loan.getAmount(), loan.getMonths());
        System.out.printf("Payment after %d months: R$ %.2f\n", loan.getMonths(), payment);
    }

    public static Loan requestLoan(Scanner scanner) {
        System.out.print("Amount: ");
        Double amount = scanner.nextDouble();
        System.out.print("Months: ");
        Integer months = scanner.nextInt();
        return new Loan(amount, months);
    }
}
