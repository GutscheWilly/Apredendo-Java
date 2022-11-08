public class App {
    public static void main(String[] args) throws Exception {
        Triangulo triangulo1 = new Triangulo();
        triangulo1.calcularAreaTriangulo();
        Triangulo triangulo2 = new Triangulo();
        triangulo2.calcularAreaTriangulo();
        triangulo1.mostarAreaTriangulo();
        triangulo2.mostarAreaTriangulo();
    }
}