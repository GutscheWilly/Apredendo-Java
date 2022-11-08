import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int senha;

        do {
            senha = scanner.nextInt();
            if(senha == 2002) {
                System.out.println("Acesso permitido!");
            } else {
                System.out.println("Senha inválida!");
            }
        } while(senha != 2002);

        scanner.close();
    }
}