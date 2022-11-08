import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2;
        int quantidade = scanner.nextInt();

        for(int i = 0 ; i < quantidade ; i++) {
            valor1 = scanner.nextInt();
            valor2 = scanner.nextInt();
            if(valor2 != 0) {
                float resultado = (float) valor1 / valor2;
                System.out.println(resultado);
            } else {
                System.out.println("Divisão impossível!");
            }
        }
        scanner.close();
    }
}