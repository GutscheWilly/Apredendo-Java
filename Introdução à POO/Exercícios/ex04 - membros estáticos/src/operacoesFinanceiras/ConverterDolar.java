package operacoesFinanceiras;

public class ConverterDolar {
    
    public static float quatidadeEmReais(float precoDolar, float quantidadeDeDolares) {
        return precoDolar * quantidadeDeDolares * 1.06f;
    }
}
