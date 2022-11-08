import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int quantidadeValores = scanner.nextInt();
        int[] valores = new int[quantidadeValores];
        int dentro = 0, fora = 0;

        for(int i = 0 ; i < valores.length ; i++) {
            valores[i] = scanner.nextInt();
            if(valores[i] >= 10 && valores[i] <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }
        System.out.print("Valores: ");
        for(int i = 0 ; i < valores.length ; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println("\nDentro: " + dentro);
        System.out.println("Fora: " + fora);
        scanner.close();
    }
}