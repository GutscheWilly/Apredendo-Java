import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        Integer quantityOfTests = scanner.nextInt();

        for (int test = 1 ; test <= quantityOfTests ; test++) {
            Integer quantityOfProjectiles = requestQuantityOfProjectiles(scanner);
            List<Projectile> listOfProjectiles = requestListOfProjectiles(quantityOfProjectiles, scanner);
            Integer maxWeight = requestMaxWeight(scanner);
            Cannon cannon = new Cannon(quantityOfProjectiles, listOfProjectiles, maxWeight);

            Integer resistence = requestResistance(scanner);
            Castle castle = new Castle(resistence);

            printResult(cannon.isAbleToDefeat(castle.getResistence()));
        }

        scanner.close();
    }

    public static Integer requestQuantityOfProjectiles(Scanner scanner) {
        return scanner.nextInt();
    }

    public static List<Projectile> requestListOfProjectiles(Integer quantityOfProjectiles, Scanner scanner) {
        List<Projectile> listOfProjectiles = new ArrayList<>();

        for (int i = 0 ; i < quantityOfProjectiles ; i++) {
            Integer powerOfDestruction = scanner.nextInt();
            Integer weight = scanner.nextInt();
            Projectile projectile = new Projectile(powerOfDestruction, weight);
            listOfProjectiles.add(projectile);
        }

        return listOfProjectiles;
    }

    public static Integer requestMaxWeight(Scanner scanner) {
        return scanner.nextInt();
    } 

    public static Integer requestResistance(Scanner scanner) {
        return scanner.nextInt();
    }

    public static void printResult(boolean isAbleToDefeat) {
        if (isAbleToDefeat) {
            System.out.println("Missao completada com sucesso");
        } else {
            System.out.println("Falha na missao");
        }
    } 
}
