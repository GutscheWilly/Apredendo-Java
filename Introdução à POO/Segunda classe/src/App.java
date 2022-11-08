import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();

        System.out.printf("Digite o nome do produto: ");
        estoque.setNome(scanner.next());
        System.out.printf("Digite o preço: ");
        estoque.setPreco(scanner.nextDouble());
        System.out.printf("Digite a quantidade: ");
        estoque.adicionarProduto(scanner.nextInt());
        estoque.mostrarAtributosDoEstoque();
        System.out.printf("Valor total do estoque: %.2f\n", estoque.valorTotalDoEstoque());
        scanner.close();
    }
}