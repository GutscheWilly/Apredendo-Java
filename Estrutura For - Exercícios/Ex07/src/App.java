import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();

        for(int i = 1 ; i <= valor ; i++) {
            System.out.printf("%d %d %d\n", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3));
        } 
        scanner.close();
    }
}