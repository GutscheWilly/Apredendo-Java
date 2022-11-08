package faculdade.menu;

public class MenuPrincipal {
    
    public static String imprimirMenuPrincipal() {
        return String.format("(1) -> Cadastrar novo aluno\n(2) -> Logar em uma conta\n(3) -> Monstrar todos os alunos cadastrados");
    }

    public static String solicitarNome() {
        return String.format("Informe o nome do aluno: ");
    }

    public static String solicitarCurso() {
        return String.format("Informe o curso de graduação: ");
    }

    public static String solicitarTelefone() {
        return String.format("Informe um telefone para contato: ");
    }

    public static String solicitarRa() {
        return String.format("Informe o RA do aluno: ");
    }

    public static String solicitarOpcaoMenu() {
        return String.format("Digite umas das opções: ");
    }
}
