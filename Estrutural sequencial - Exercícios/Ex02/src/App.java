import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double raio = input.nextDouble();
        double pi = 3.14159;
        double area = pi * Math.pow(raio, 2);
        System.out.printf("Área do círculo: %.4f", area);
        input.close();
    }
}