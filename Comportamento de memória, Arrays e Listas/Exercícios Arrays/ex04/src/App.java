import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de números que deseja digitar: ");
        int quantidade = scanner.nextInt();
        int[] vetor = new int[quantidade];
        for(int i = 0 ; i < vetor.length ; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Números pares: ");
        int quantidadePares = 0;
        for(int i = 0 ; i < vetor.length ; i++) {
            if(vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
                quantidadePares++;
            }
        }
        System.out.print("quantidade de pares: " + quantidadePares);
        scanner.close();
    }
}
