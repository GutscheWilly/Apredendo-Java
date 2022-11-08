import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos valores terá cada vetor? ");
        int quantidade = scanner.nextInt();
        int[] vetor1 = new int[quantidade];
        int[] vetor2 = new int[quantidade];
        int[] vetor3 = new int[quantidade];
        System.out.println("Digite os valores do vetor A: ");
        for(int i = 0 ; i < vetor1.length ; i++) {
            vetor1[i] = scanner.nextInt();
        }
        System.out.println("Digite os valores do vetor B: ");
        for(int i = 0 ; i < vetor2.length ; i++) {
            vetor2[i] = scanner.nextInt();
        }
        for(int i = 0 ; i < vetor3.length ; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }
        System.out.println("Vetor resultante: ");
        for(int i = 0 ; i < vetor3.length ; i++) {
            System.out.println(vetor3[i]);
        } 
        scanner.close();
    }
}
