import java.util.Scanner;
import operacoesFinanceiras.ConverterDolar;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o preço do dolar?");
        float precoDolar = scanner.nextFloat();
        System.out.println("Quantos dólares deseja comprar?");
        float quantidadeDolares = scanner.nextFloat();
        System.out.println("Valor a ser pago em reais: " + ConverterDolar.quatidadeEmReais(precoDolar, quantidadeDolares));
        scanner.close();
    }
}
