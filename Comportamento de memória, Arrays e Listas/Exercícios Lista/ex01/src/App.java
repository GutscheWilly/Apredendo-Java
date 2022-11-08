import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quantos empregados serão registrados: ");
        int quantidadeFuncionarios = scanner.nextInt();
        List<Funcionario> funcionarios = new ArrayList<>();
        for(int i = 0 ; i < quantidadeFuncionarios ; i++) {
            System.out.printf("Empregado (%d):\n", i + 1);
            System.out.println("ID:");
            int id = scanner.nextInt();
            System.out.println("Nome:");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.println("Salário:");
            double salario = scanner.nextDouble();
            Funcionario funcionario = new Funcionario(id, nome, salario);
            funcionarios.add(funcionario);
        }
        System.out.println("Digite o ID do funcionário que receberá aumento: ");
        int id = scanner.nextInt();
        Funcionario funcionarioPromovido = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(funcionarioPromovido != null) {
            System.out.println("Digite a porcentagem de aumento: ");
            double porcentagem = scanner.nextDouble();
            funcionarioPromovido.aumentoSalarial(porcentagem);
        } else {
            System.out.println("ID informado não existe!");
        }
        System.out.println("Lista de empregados:");
        for(Funcionario x : funcionarios) {
            System.out.println(x.toString());
        }
        scanner.close();
    }
}
