package faculdade;

import java.util.Random;

public class Aluno {
    
    private String nome;
    private int ra;
    private String curso;
    private int telefone;

    public Aluno(String nome, String curso, int telefone) {
        this.nome = nome;
        gerarRaAleatoria();
        this.curso = curso;
        this.telefone = telefone;
    }

    private void gerarRaAleatoria() {
        Random random = new Random();
        ra = random.nextInt(10000, 50000);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return String.format("Nome: %s, RA: %d, Curso: %s, Telefone: %d", nome, ra, curso, telefone);
    }
}
