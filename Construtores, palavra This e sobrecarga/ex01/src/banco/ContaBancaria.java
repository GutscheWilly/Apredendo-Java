package banco;

public class ContaBancaria {
    
    private int numeroDaConta;
    private String nomeTitular;
    private double saldo;
    private String senha;

    public ContaBancaria(int numeroDaConta, String nomeTitular, double saldo, String senha) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.senha = senha;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String toString() {
        return String.format("Dados da conta ->  Número: %d  |  Nome: %s  |  Saldo: %.2f R$\n", 
        numeroDaConta, 
        nomeTitular, 
        saldo);
    }

    public void depositarDinheiro(double valor) {
        saldo += valor;
    }

    public void sacarDinheiro(double valor) {
        saldo -= valor + 5;
    }
}
