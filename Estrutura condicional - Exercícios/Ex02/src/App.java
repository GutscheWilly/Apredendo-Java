import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();

        if(valor % 2 == 0) {
            System.out.println("Par!");
        } else {
            System.out.println("ímpar!");
        }

        scanner.close();
    }
}
