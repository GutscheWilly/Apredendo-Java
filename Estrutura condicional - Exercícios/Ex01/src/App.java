import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();

        if(valor >= 0) {
            System.out.println("Não negativo");
        } else {
            System.out.println("Negativo!");
        }

        scanner.close();
    }
}