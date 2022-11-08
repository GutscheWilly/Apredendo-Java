import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Nome: ");
        aluno.setNome(scanner.nextLine());
        System.out.println("Digite as 3 notas: ");
        int[] notas = new int[3];
        for(int i = 0 ; i < 3 ; i++) {
            notas[i] = scanner.nextInt();
        }
        aluno.setNotas(notas);
        aluno.exibirAprovacao();
        scanner.close();
    }
}