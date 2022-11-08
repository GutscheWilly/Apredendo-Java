import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int inicio;
        int fim;
        boolean fechar = false;

        while(true){
            inicio = scanner.nextInt();
            fim = scanner.nextInt();

            if(inicio < fim) {
                System.out.printf("O jogo durou %d horas\n", fim - inicio);
            } else {
                System.out.printf("O jogo durou %d horas\n", (24 - inicio) + fim);
            }

            if(fechar) {
                scanner.close();
            }
        }
    }
}