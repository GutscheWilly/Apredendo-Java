import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int alcool = 0, gasolina = 0, diesel = 0;
        int opcao = scanner.nextInt();

        while(opcao != 4) {
            switch(opcao) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                default:
                    System.out.println("Opção inválida!");
            }
            opcao = scanner.nextInt();
        }

        System.out.println("Muito obrigado!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        scanner.close();
    }
}