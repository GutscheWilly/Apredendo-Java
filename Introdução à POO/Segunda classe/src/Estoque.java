public class Estoque {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
        return;
    }

    public void setPreco(double preco) {
        this.preco = preco;
        return;
    }

    public void adicionarProduto(int quantidadeAdicionada) {
        quantidade += quantidadeAdicionada;
        return;
    }

    public void removerProduto(int quantidadeRemovida) {
        quantidade -= quantidadeRemovida;
        return;
    }

    public double valorTotalDoEstoque() {
        return preco * quantidade;
    }

    public void mostrarAtributosDoEstoque() {
        System.out.printf("Nome do produto: %s | Preço: %.2f R$ | Quantidade: %d\n", nome, preco, quantidade);
        return;
    }
}