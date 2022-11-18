import java.util.InputMismatchException;
import java.util.Scanner;

import models.entities.Account;
import models.exceptions.WithdrawException;

public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            Integer number = scanner.nextInt();
            System.out.print("Holder: ");
            scanner.nextLine();
            String holder = scanner.nextLine();
            System.out.print("Initial balance: ");
            Double balance = scanner.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = scanner.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);
            System.out.println(account);

            System.out.print("Enter amount for withdraw: ");
            Double amount = scanner.nextDouble();
            account.withdraw(amount);
            System.out.println(account);
        }
        catch (InputMismatchException erro) {
            System.out.println("Input erro!");
        }
        catch (WithdrawException erro) {
            System.out.println(erro.getMessage());
        }
        finally {
            System.out.println("End of program");
            scanner.close();
        }
    }
}
