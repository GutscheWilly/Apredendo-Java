import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        int fatorial = 1;

        for(int i = valor ; i > 1 ; i--) {
            fatorial *= i;
        }

        System.out.println(fatorial);
        scanner.close();
    }
}