public class App {
    public static void main(String[] args) throws Exception {
        Cardapio cardapio = new Cardapio();
        cardapio.receberValorQuantidade();
        System.out.printf("Total: %.2f", cardapio.precoCompra());
    }
}