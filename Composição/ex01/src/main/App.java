package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.worker.Worker;
import entities.worker.compositions.HourContract;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter department's name: ");
        String departmentName = scanner.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Level: ");
        String level = scanner.nextLine();
        System.out.print("Base salary: ");
        Double baseSalary = scanner.nextDouble();
        System.out.print("How many contracts to this worker?: ");
        Integer numberOfContracts = scanner.nextInt();

        Worker worker = new Worker(name, level, baseSalary, departmentName);
        for (int i = 1; i <= numberOfContracts; i++) {
            System.out.println("----------------------------------------");
            System.out.printf("Enter contract #%d:\n", i);
            System.out.print("Date (DD/MM/YYYY): ");
            scanner.nextLine();
            String stringDate = scanner.nextLine();
            LocalDate date = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Value per hour: ");
            Double valuePerHour = scanner.nextDouble();
            System.out.print("Duration (hours): ");
            Integer hours = scanner.nextInt();
            worker.addContract(new HourContract(date, valuePerHour, hours));
            System.out.println("Contract added succesful!");
            System.out.println("----------------------------------------");
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        scanner.nextLine();
        String stringDate = scanner.nextLine();
        int month = Integer.parseInt(stringDate.substring(0, 2));
        int year = Integer.parseInt(stringDate.substring(3));
        LocalDate incomeDate = LocalDate.of(year, month, 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
        System.out.printf("Income for %s: %.2f R$\n", incomeDate.format(formatter),
                worker.income(incomeDate.getYear(), incomeDate.getMonthValue()));

        System.out.println("Worker datas:");
        System.out.println(worker);
        System.out.println("All contracts made:");
        System.out.println("----------------------------------------");
        worker.showAllContracts();
        System.out.println("----------------------------------------");

        scanner.close();
    }
}
