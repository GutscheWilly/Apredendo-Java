public class Funcionario {
    
    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public String toString() {
        return String.format("ID: %d | Nome: %s | Salário: %.2f R$", id, nome, salario);
    }

    public void aumentoSalarial(double porcentagem) {
        salario *= 1 + (porcentagem / 100);
    }
}
