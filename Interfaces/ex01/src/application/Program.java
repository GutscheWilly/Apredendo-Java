package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import models.entities.Contract;
import models.services.ContractService;
import models.services.PaypalService;

public class Program {
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        Contract contract = requestContract(scanner);
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, requestQuantityOfMonths(scanner));

        System.out.println(contract);
        scanner.close();
    }

    public static Contract requestContract(Scanner scanner) {
        System.out.println("Entre os dados do contrato:");
        System.out.print("Número: ");
        Integer number = scanner.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        scanner.nextLine();
        String stringDate = scanner.nextLine();
        LocalDate date = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Valor do contrato: ");
        Double totalValue = scanner.nextDouble();
        return new Contract(number, date, totalValue);
    }

    public static Integer requestQuantityOfMonths(Scanner scanner) {
        System.out.print("Entre com o número de parcelas: ");
        Integer quantityOfMonths = scanner.nextInt();
        return quantityOfMonths;
    }
}
