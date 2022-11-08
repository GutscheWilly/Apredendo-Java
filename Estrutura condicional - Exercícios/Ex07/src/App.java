import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        System.out.printf("Ponto: (%.2f ; %.2f)\n\n", x, y);

        if(x == 0 && y == 0) {
            System.out.println("Origem!");
        } else if(x == 0) {
            System.out.println("Eixo Y");
        } else if(y == 0) {
            System.out.println("Eixo X!");
        } else if(x > 0){
            if(y > 0) {
                System.out.println("Q1");
            } else {
                System.out.println("Q4");
            }
        } else {
            if(y > 0) {
                System.out.println("Q2");
            } else {
                System.out.println("Q3");
            }
        }

        scanner.close();
    }
}