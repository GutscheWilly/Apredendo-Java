import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a largura do retângulo: ");
        retangulo.setLargura(scanner.nextDouble());
        System.out.println("Digite a altura do retângulo: ");
        retangulo.setAltura(scanner.nextDouble());
        System.out.println(retangulo.toString());

        scanner.close();
    }
}