public class Funcionario {
    
    private String nome;
    private double salarioBruto;
    private double imposto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentarSalarioBruto(double aumentoPercentual) {
        salarioBruto *= 1 + aumentoPercentual / 100;
    }
}