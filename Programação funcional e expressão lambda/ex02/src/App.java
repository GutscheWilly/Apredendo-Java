import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class App {

    public static void main(String[] args) throws Exception {
        File file = new File("c:\\temp\\in.txt");
        List<Employee> employeeList = getEmployeesFromFile(file);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the salary: ");
            Double minimunSalary = scanner.nextDouble();
            List<Employee> employeesThatHaveSalaryGreaterThanMinimun = employeeList.stream()
                .filter(x -> x.getSalary() > minimunSalary)
                .collect(Collectors.toList());
            System.out.println("Email of people whose salary is more than " + String.format("R$ %.2f", minimunSalary));
            employeesThatHaveSalaryGreaterThanMinimun.stream()
                .map(x -> x.getEmail())
                .sorted()
                .forEach(System.out::println);
            Double sumOfSalaryFromEmployeesThatNameStartsWithM = employeeList.stream()
                .filter(x -> x.getName().charAt(0) == 'M')
                .map(x -> x.getSalary())
                .reduce(0.0, (x, y) -> x + y);
            System.out.println("Sum of salary of people whose name starts with 'M': R$ " + String.format("%.2f", sumOfSalaryFromEmployeesThatNameStartsWithM));
        }
    }

    public static List<Employee> getEmployeesFromFile(File file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            List<Employee> employeeList = new ArrayList<>();
            String currentLine = bufferedReader.readLine();
            while (currentLine != null) {
                String[] currentLineSplited = currentLine.split(",");
                String name = currentLineSplited[0];
                String email = currentLineSplited[1];
                Double salary = Double.parseDouble(currentLineSplited[2]);
                Employee employee = new Employee(name, email, salary);
                employeeList.add(employee);
                currentLine = bufferedReader.readLine();
            }
            return employeeList;
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }
}
