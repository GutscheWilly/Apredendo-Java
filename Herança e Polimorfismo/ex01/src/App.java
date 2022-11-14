import java.util.ArrayList;
import java.util.Scanner;

import employee.Employee;
import employee.outsource.OutsourceEmployee;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scanner.nextInt();

        for (int i = 0 ; i < numberOfEmployees ; i++) {
            System.out.println("Employee (" + (i + 1) + ") datas:");
            System.out.print("Outsource (y/n): ");
            char isOutsource = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            System.out.print("Value per hours: ");
            double valuePerHour = scanner.nextDouble();
            if (isOutsource == 'y') {
                System.out.print("Addicional charge: ");
                double addicionalCharge = scanner.nextDouble();
                employees.add(new OutsourceEmployee(name, hours, valuePerHour, addicionalCharge));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("PAYMENTS:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        scanner.close();
    }
}
