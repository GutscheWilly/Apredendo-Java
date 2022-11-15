import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.TaxPayer;
import entities.Company;
import entities.Individual;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        List<TaxPayer> listOfTaxPayers = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int numberOfTaxPayers = scanner.nextInt();

        for (int i = 1 ; i <= numberOfTaxPayers ; i++) {
            System.out.printf("Tax Payer (%d):\n", i);
            System.out.print("Individual or company (i/c): ");
            char kindOfTaxPayer = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = scanner.nextDouble();
            if (kindOfTaxPayer == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = scanner.nextDouble();
                listOfTaxPayers.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = scanner.nextInt();
                listOfTaxPayers.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        Double totalTaxes = 0.0;
        System.out.println("TAXES PAID:");
        for (TaxPayer taxPayer : listOfTaxPayers) {
            System.out.printf("%s: $ %.2f\n", taxPayer.getName(), taxPayer.tax());
            totalTaxes += taxPayer.tax();
        }
        System.out.printf("TOTAL TAXES: $ %.2f\n", totalTaxes);
        scanner.close();
    }
}
