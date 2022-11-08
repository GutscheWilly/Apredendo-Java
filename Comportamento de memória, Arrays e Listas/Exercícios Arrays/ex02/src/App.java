import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números deseja informar? ");
        int quantidade = scanner.nextInt();
        int[] vetor = new int[quantidade];
        int soma = 0;
        for(int i = 0 ; i < vetor.length ; i ++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }
        System.out.print("Valores: ");
        for(int i = 0 ; i < vetor.length ; i++) {
            System.out.printf("%d ", vetor[i]);
        }
        System.out.println("\nSoma: " + soma);
        double media = soma / quantidade;
        System.out.printf("Média: %.2f\n", media);
        scanner.close();
    }
}
