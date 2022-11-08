import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2;

        valor1 = scanner.nextInt();
        valor2 = scanner.nextInt();

        if(valor1 > valor2) {
            if(valor1 % valor2 == 0) {
                System.out.println("São multiplos!");
            } else {
                System.out.println("Não são multiplos!");
            }
        } else {
            if(valor2 % valor1 == 0) {
                System.out.println("São multiplos!");
            } else {
                System.out.println("Não são multiplos!");
            }
        }
        scanner.close();
    }
}