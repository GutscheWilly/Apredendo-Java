import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        System.out.printf("\nDigite um valor para A: ");
        a = input.nextInt();
        System.out.printf("\nDigite um valor para B: ");
        b = input.nextInt();
        System.out.printf("\nDigite um valor para C: ");
        c = input.nextInt();
        System.out.printf("\nDigite um valor para D: ");
        d = input.nextInt();
        System.out.printf("\n\nDifrerença: " + (a * b - c * d));
        input.close();
    }   
}