import java.util.Scanner;

public class Valores {
    
    Scanner scanner = new Scanner(System.in);
    public float a;
    public float b;
    public float c;

    public void receberValores(){
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
    }

    public float areaTriangulo(){
        float area = a * c / 2;
        return(area);
    }

    public float areaCirculo(){
        float area = 3.1415f * (float)Math.pow(c, 2);
        return(area);
    }

    public float areaTrapezio(){
        float area = (a + b) * c / 2;
        return(area);
    }

    public float areaQuadrado(){
        float area = (float)Math.pow(b, 2);
        return(area);
    }

    public float areaRetangulo(){
        float area = a * b;
        return(area);
    }

    public void imprimirAreas(){
        System.out.println("Triângulo: " + areaTriangulo());
        System.out.println("Círculo: " + areaCirculo());
        System.out.println("Trapézio: " + areaTrapezio());
        System.out.println("Quadrado: " + areaQuadrado());
        System.out.println("Retângulo: " + areaRetangulo());
    }
}