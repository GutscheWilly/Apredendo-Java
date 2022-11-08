package classes;

public class Peca {
    
    public int codigo;
    public int quantidade;
    public float valor;

    public float calcularCusto(){
        float custo = quantidade * valor;
        return(custo);
    }
}