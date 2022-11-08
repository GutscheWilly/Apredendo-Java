import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        
        for(int i = 1 ; i <= numero ; i++) {
            if(numero % i == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}