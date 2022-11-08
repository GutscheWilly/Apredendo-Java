import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        float[] valores = new float[3];
        int quantidade = scanner.nextInt();
        float resultado;

        for(int i = 0 ; i < quantidade ; i++) {
            for(int j = 0 ; j < valores.length ; j++) {
                valores[j] = scanner.nextFloat();
            }
            resultado = ((2 * valores[0]) + (3 * valores[1]) + (5 * valores[2])) / 10;
            System.out.printf("%.1f", resultado);
        }
        scanner.close();
    }
}