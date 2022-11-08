import java.util.ArrayList;
import java.util.Scanner;

import faculdade.Aluno;
import faculdade.menu.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        boolean executarPrograma = true;

        while(executarPrograma) {
            System.out.println(MenuPrincipal.imprimirMenuPrincipal());
            System.out.print(MenuPrincipal.solicitarOpcaoMenu());
            switch(scanner.nextInt()) {
                case 1:
                    alunos.add(receberNovoAluno());
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.print(MenuPrincipal.solicitarNome());
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    System.out.print(MenuPrincipal.solicitarRa());
                    int ra = scanner.nextInt();
                    Aluno alunoLogado = alunos.stream().filter(aluno -> aluno.getNome().equals(nome) && aluno.getRa() == ra).findFirst().orElse(null);
                    if(alunoLogado != null) {
                        boolean usuarioLogado = true;
                        while(usuarioLogado) {
                            System.out.println(alunoLogado.toString());
                            System.out.println(MenuLogado.imprimirMenuLogado());
                            System.out.println(MenuPrincipal.solicitarOpcaoMenu());
                            switch(scanner.nextInt()) {
                                case 1:
                                    System.out.print(MenuLogado.solicitarAlteracaoNome());
                                    scanner.nextLine();
                                    alunoLogado.setNome(scanner.nextLine());
                                    break;
                                case 2:
                                    System.out.print(MenuLogado.solicitarAlteracaoCurso());
                                    scanner.nextLine();
                                    alunoLogado.setCurso(scanner.nextLine());
                                    break;
                                case 3:
                                    System.out.print(MenuLogado.solicitarAlteracaoTelefone());
                                    alunoLogado.setTelefone(scanner.nextInt());
                                    break;
                                case 4:
                                    System.out.print(MenuLogado.solicitarExclusaoCadastro());
                                    scanner.nextLine();
                                    if(scanner.nextLine().equals("confirmar")) {
                                        alunos.remove(alunoLogado);
                                    }
                                case 0:
                                    usuarioLogado = false;
                                    break;
                                default:
                                    System.out.println("Opção inválida!");
                            }
                        }
                    }
                    break;
            }
        }
        scanner.close();
    }

    private static Aluno receberNovoAluno(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(MenuPrincipal.solicitarNome());
        String nome = scanner.nextLine();
        System.out.print(MenuPrincipal.solicitarCurso());
        String curso = scanner.nextLine();
        System.out.print(MenuPrincipal.solicitarTelefone());
        int telefone = scanner.nextInt();
        scanner.close();
        return new Aluno(nome, curso, telefone);
    }
}
