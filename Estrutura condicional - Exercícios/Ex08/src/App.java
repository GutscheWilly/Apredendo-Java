import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        float salario = scanner.nextFloat();
        float imposto = 0f;

        if(salario > 2000 && salario <= 3000) {
            imposto += (salario - 2000) * 0.08;
        } else if(salario > 3000 && salario <= 4500) {
            imposto += 1000 * 0.08;
            imposto += (salario - 3000) * 0.18;
        } else if(salario > 4500) {
            imposto += 1000 * 0.08;
            imposto += 1500 * 0.18;
            imposto += (salario - 4500) * 0.28;
        }

        if(imposto == 0) {
            System.out.println("Isento!");
        } else {
            System.out.printf("Imposto: %.2f R$", imposto);
        }

        scanner.close();
    }
}