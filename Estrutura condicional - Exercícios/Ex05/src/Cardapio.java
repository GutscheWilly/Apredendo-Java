import java.util.Scanner;

public class Cardapio {
    Scanner scanner = new Scanner(System.in);
    public float valor;
    public int codigo, quantidade;

    public void receberValorQuantidade(){
        codigo = scanner.nextInt();
        quantidade = scanner.nextInt();
    }

    public void procurarValor(){
        switch(codigo){
            case 1:
                valor = 4f;
                break;
            case 2:
                valor = 4.5f;
                break;
            case 3:
                valor = 5f;
                break;
            case 4:
                valor = 2f;
                break;
            case 5:
                valor = 1.5f;
                break;
            default:
        }
    }

    public float precoCompra(){
        float preco;
        procurarValor();
        System.out.printf("%d %.2f %d\n\n", codigo, valor, quantidade);
        preco = valor * quantidade;
        return(preco);
    }
}