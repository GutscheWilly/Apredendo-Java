public class Retangulo {

    private double largura;
    private double altura;

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getLargura() {
        return largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double areaRetangulo() {
        return largura * altura;
    }

    public double perimetroRetangulo() {
        return 2 * (largura + altura);
    }

    public double diagonalRetangulo() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }

    public String toString() {
        return "\nLargura: " + String.format("%.2f", largura) +
               "\nAltura: " + String.format("%.2f", altura) +
               "\nÁrea: " + String.format("%.2f", areaRetangulo()) +
               "\nPerímetro: "+ String.format("%.2f", perimetroRetangulo()) +
               "\nDiagonal: " + String.format("%.2f", diagonalRetangulo()) + "\n";
    }
}