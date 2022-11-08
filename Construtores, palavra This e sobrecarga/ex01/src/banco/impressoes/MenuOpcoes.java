package banco.impressoes;

public class MenuOpcoes {
    
    public static void imprimirMenu() {
        System.out.println("(1) - Cadastrar conta\n(2) - Logar em uma conta\n(3) - Monstrar todos os usúarios cadastrados\n(4) -> Fechar programa");
    }

    public static void imprimirOpcaoDepositoInicial() {
        System.out.println("Deseja realizar um depósito inicial?");
    }

    public static void imprirmirOpcoesUsuarioLogado() {
        System.out.println("(1) -> Realizar depósito\n(2) -> Realizar saque\n(3) -> Alterar nome\n(4) -> Alterar Senha\n(5) -> Retornar ao menu principal");
    }
}
