import java.util.Scanner;
import banco.ContaBancaria;
import banco.impressoes.MenuOpcoes;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        ContaBancaria[] contasCadastradas = new ContaBancaria[MAXIMO_CADASTROS];
        int quantidadeCadastros = 0;
        boolean fimPrograma = false;

        while(!fimPrograma) {
            MenuOpcoes.imprimirMenu();
            switch(scanner.nextInt()) {
                case 1:
                    if(quantidadeCadastros < MAXIMO_CADASTROS) {
                        System.out.println("Digite o número da conta: ");
                        int numero = scanner.nextInt();
                        System.out.println("Digite o nome: ");
                        scanner.nextLine();
                        String nome = scanner.nextLine();
                        System.out.println("Deseja realizar um depósito inicial? (sim / não)");
                        double deposito = 0;
                        if(scanner.nextLine().equals("sim")) {
                            System.out.println("Digite o valor do depósito inicial: ");
                            deposito = scanner.nextDouble();
                            scanner.nextLine();
                        }
                        System.out.println("Digite a senha: ");
                        String senha = scanner.nextLine();
                        contasCadastradas[quantidadeCadastros] = new ContaBancaria(numero, nome, deposito, senha);
                        quantidadeCadastros++;
                        System.out.println("\t<<< Usuário cadastrado com sucesso! >>>");
                    } else {
                        System.out.println("\t<<< Não é possível realizar novos cadastros! >>>");
                    }
                    break;
                case 2:
                    System.out.println("Insira o número da conta: ");
                    int numero = scanner.nextInt();
                    System.out.println("Insira a sneha: ");
                    scanner.nextLine();
                    String senha = scanner.nextLine();
                    boolean findObject = false;
                    for(int i = 0 ; i < quantidadeCadastros ; i++) {
                        if(contasCadastradas[i].getNumeroDaConta() == numero && contasCadastradas[i].getSenha().equals(senha)) {
                            findObject = true;
                            boolean deslogar = false;
                            System.out.println("Usuário logado com sucesso!");
                            while(!deslogar) {
                                System.out.println(contasCadastradas[i].toString());
                                MenuOpcoes.imprirmirOpcoesUsuarioLogado();
                                switch(scanner.nextInt()) {
                                    case 1:
                                        System.out.println("Inseria o valor que deseja depositar: ");
                                        double deposito = scanner.nextDouble();
                                        contasCadastradas[i].depositarDinheiro(deposito);
                                        System.out.println("Depósito realizado com sucesso!");
                                        break;
                                    case 2:
                                        System.out.println("Inseria o valor que deseja sacar: ");
                                        double saque = scanner.nextDouble();
                                        contasCadastradas[i].sacarDinheiro(saque);
                                        System.out.println("Saque realizado com sucesso!");
                                        break;
                                    case 3:
                                        System.out.println("Digite o novo nome: ");
                                        scanner.nextLine();
                                        String nome = scanner.nextLine();
                                        contasCadastradas[i].setNomeTitular(nome);
                                        System.out.println("Nome alterado com sucesso!");
                                        break;
                                    case 4:
                                        System.out.println("Digite a senha atual: ");
                                        scanner.nextLine();
                                        String password = scanner.nextLine();
                                        if(contasCadastradas[i].getSenha().equals(password)) {
                                            System.out.println("Digite a nova senha: ");
                                            scanner.nextLine();
                                            password = scanner.nextLine();
                                            contasCadastradas[i].setSenha(password);
                                            System.out.println("Senha alterada com sucesso!");
                                        } else {
                                            System.out.println("Senha incorreta!");
                                        }
                                        break;
                                    case 5:
                                        deslogar = true;
                                        break;
                                    default:
                                        System.out.println("Opção inválida!");
                                }
                            }
                            break;
                        }
                    }
                    if(!findObject) {
                        System.out.println("Número da conta ou senha incorreta!");
                    }
                    break;
                case 3:
                    System.out.println("Usuários cadastrado: ");
                    for(int i = 0 ; i < quantidadeCadastros ; i++) {
                        System.out.println("\t" + contasCadastradas[i].toString());
                    }
                    break;

                case 4:
                    fimPrograma = true;
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }

    public static int MAXIMO_CADASTROS = 1000;
}
