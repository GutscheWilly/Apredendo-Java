import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();

        for(int i = 1 ; i <= valor ; i += 2) {
            System.out.println(i);
        }
        scanner.close();
    }
}