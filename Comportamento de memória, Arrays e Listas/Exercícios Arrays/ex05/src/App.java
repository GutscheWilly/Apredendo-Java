import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de números: ");
        int quantidade = scanner.nextInt();
        int[] vetor = new int[quantidade];
        for(int i = 0 ; i < vetor.length ; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = scanner.nextInt();
        }
        int maiorValor = vetor[0];
        int indexMaiorValor = 0;
        for(int i = 1 ; i < vetor.length ; i++) {
            if(vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                indexMaiorValor = i;
            }
        }
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Posição: " + indexMaiorValor);
        scanner.close();
    }
}
