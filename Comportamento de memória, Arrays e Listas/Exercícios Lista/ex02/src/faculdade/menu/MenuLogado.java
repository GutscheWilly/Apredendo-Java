package faculdade.menu;

public class MenuLogado {
    
    public static String imprimirMenuLogado() {
        return String.format("(1) -> Alterar nome\n(2) -> Alterar curso\n(3) -> Alterar telefone\n(4) -> Excluir cadastro de aluno\n(0) -> Deslogar e voltar ao menu principal");
    }

    public static String solicitarAlteracaoNome() {
        return String.format("Digite o novo nome: ");
    }

    public static String solicitarAlteracaoCurso() {
        return String.format("Digite o novo curso: ");
    }

    public static String solicitarAlteracaoTelefone() {
        return String.format("Digite o novo telefone: ");
    }

    public static String solicitarExclusaoCadastro() {
        return String.format("Para excluir digite (confimar): ");
    }
}
