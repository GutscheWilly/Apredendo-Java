import java.util.Scanner;
import classes.Peca;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Peca peca1 = new Peca();
        peca1.codigo = scanner.nextInt();
        peca1.quantidade = scanner.nextInt();
        peca1.valor = scanner.nextFloat();

        Peca peca2 = new Peca();
        peca2.codigo = scanner.nextInt();
        peca2.quantidade = scanner.nextInt();
        peca2.valor = scanner.nextFloat();

        System.out.println("Custo: " + (peca1.calcularCusto() + peca2.calcularCusto()) + " R$");

        scanner.close();
    }
}
