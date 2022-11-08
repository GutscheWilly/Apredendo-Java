import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas:");
        int quatLinhas = scanner.nextInt();
        System.out.println("Digite a quantidade de colunas:");
        int quantColunas = scanner.nextInt();
        int[][] matriz = new int[quatLinhas][quantColunas];
        for(int i = 0 ; i < quatLinhas ; i++) {
            for(int j = 0 ; j < quantColunas ; j++) {
                matriz[i][j] = random.nextInt(0, 100);
                System.out.printf("%2d ", matriz[i][j]);
            }
            System.out.println();
        }
        while(true) {
            System.out.println("Digite um valor da matriz:");
            int valor = scanner.nextInt();
            for(int i = 0 ; i < quatLinhas ; i++) {
                for(int j = 0 ; j < quantColunas ; j++) {
                    if(matriz[i][j] == valor) {
                        System.out.printf("Posição [%d][%d] -> %d\n", i, j, matriz[i][j]);
                        if(j > 0) {
                            System.out.println("Esquerda: " + matriz[i][j - 1]);
                        }
                        if(j < quantColunas - 1) {
                            System.out.println("Direita: " + matriz[i][j + 1]);
                        }
                        if(i > 0) {
                            System.out.println("Cima: " + matriz[i - 1][j]); 
                        }
                        if(i < quatLinhas - 1) {
                            System.out.println("Baixo: " + matriz[i + 1][j]);
                        }
                    }
                }
            }
        }
    }
}
