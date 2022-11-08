import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        
        System.out.println("Nome: ");
        funcionario.setNome(scanner.nextLine());
        System.out.println("Salário bruto: ");
        funcionario.setSalarioBruto(scanner.nextDouble());
        System.out.println("Imposto: ");
        funcionario.setImposto(scanner.nextDouble());
        System.out.printf("Funcionário: %s Salário líquido: %.2f R$\n", funcionario.getNome(), funcionario.salarioLiquido());
        System.out.println("Qual o aumento percentual de salário?");
        funcionario.aumentarSalarioBruto(scanner.nextDouble());
        System.out.printf("Dados atualizados -> Funcionário: %s Salário líquido: %.2f R$\n", funcionario.getNome(), funcionario.salarioLiquido());

        scanner.close();
    }
}