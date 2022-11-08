import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numero;
        int horasTrabalhadas;
        float salarioPorHora;
        float salario;
        numero = input.nextInt();
        horasTrabalhadas = input.nextInt();
        salarioPorHora = input.nextFloat();
        salario = horasTrabalhadas * salarioPorHora;
        System.out.printf("\nNúmero: %d\nSalário: %.2f\n", numero, salario);
        input.close();
    }
}