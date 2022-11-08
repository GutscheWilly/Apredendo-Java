public class Aluno {
    
    private String nome;
    private int[] notas = new int[3];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public float notaFinal() {
        return notas[0] + notas[1] + notas[2];
    }

    public void exibirAprovacao() {
        System.out.printf("Nota final: %.2f\n", notaFinal());
        if(notaFinal() >= 60) {
            System.out.println("Aprovado!");
        } else {
            System.out.printf("Reprovado! Faltaram %.2f pontos.\n", 60 - notaFinal());
        }
    }
}