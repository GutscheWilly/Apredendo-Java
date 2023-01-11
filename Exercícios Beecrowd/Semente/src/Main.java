import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Tape tape = requestTape(scanner);
        Integer necessaryDaysToTotallyInfection = tape.necessaryDaysToTotallyInfection();

        System.out.println(necessaryDaysToTotallyInfection);
        scanner.close();
    }

    public static Tape requestTape(Scanner scanner) {
        Integer sizeTape = scanner.nextInt();
        Integer initialNumberDrops = scanner.nextInt();

        Tape tape = new Tape(sizeTape);

        for (int i = 0 ; i < initialNumberDrops ; i++) {
            int dropIndex = scanner.nextInt() - 1;
            tape.getSquads()[dropIndex].setInfected(true);
        }

        return tape;
    } 
}
