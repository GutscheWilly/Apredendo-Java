import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanttos números deseja informar? ");
        int quantidade = scanner.nextInt();
        int[] vetor = new int[quantidade];
        for(int i = 0 ; i < vetor.length ; i++) {
            vetor[i] = scanner.nextInt();
        }
        System.out.print("Vetor: ");
        for(int i = 0 ; i < vetor.length ; i++) {
            System.out.printf("%d ", vetor[i]);
        }
        System.out.print("\nNúmeros negativos do vetor: ");
        for(int i = 0 ; i < vetor.length ; i++) {
            if(vetor[i] < 0) {
                System.out.printf("%d ", vetor[i]);
            }
        }

        scanner.close();
    }
}
