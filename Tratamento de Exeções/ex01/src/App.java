import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Room number: ");
            Integer roomNumber = scanner.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            scanner.nextLine();
            LocalDate checkIn = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkOut = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println(reservation + "\n");
            
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            reservation.updateDates(checkIn, checkOut);
            System.out.println(reservation + "\n");
        } 
        catch (InputMismatchException erro) {
            System.out.println("Input erro!");
        }
        catch (DomainException erro) {
            System.out.println("Erro in reservation: " + erro.getMessage());
        } 
        catch (RuntimeException erro) {
            System.out.println("Unexpected erro!");
        }
        finally {
            System.out.println("<<< End of program >>>");
        }

        scanner.close();
    }
}
