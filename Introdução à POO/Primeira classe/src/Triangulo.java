import java.util.Scanner;

public class Triangulo {
    private Scanner scanner = new Scanner(System.in);
    public float[] lados = new float[3];
    public float semiPerimetro;
    public float area;

    private void receberLadosTriangulo() {
        System.out.printf("Digite os lados do triângulo: ");
        for(int i = 0 ; i < 3 ; i++) {
            lados[i] = scanner.nextFloat();
        }
        return;
    }

    private void calcularSemiPerimetro() {
        semiPerimetro = (lados[0] + lados[1] + lados[2]) / 2;
        return;
    }

    public void calcularAreaTriangulo() {
        receberLadosTriangulo();
        calcularSemiPerimetro();
        area = (float)Math.sqrt(semiPerimetro * (semiPerimetro - lados[0]) * (semiPerimetro - lados[1]) * (semiPerimetro - lados[2]));
        return;
    }

    public void mostarAreaTriangulo() {
        System.out.printf("Área do triangulo: %.2f\n", area);
        return;
    }
}