import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pessoa serão inseridas? ");
        int quantidade = scanner.nextInt();
        Pessoa[] pessoa = new Pessoa[quantidade];
        float mediaAlturas = 0f;
        float porcentagemMenor16Anos = 0f;
        for(int i = 0 ; i < pessoa.length ; i++) {
            System.out.printf("Dados da %d pessoa:\n", i + 1);
            System.out.print("Nome -> ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Idade -> ");
            int idade = scanner.nextInt();
            System.out.print("Altura -> ");
            float altura = scanner.nextFloat();
            pessoa[i] = new Pessoa(nome, idade, altura);
        }
        for(int i = 0 ; i < pessoa.length ; i++) {
            mediaAlturas += pessoa[i].getAltura();
            if(pessoa[i].getIdade() < 16) {
                porcentagemMenor16Anos++;
            }
        }
        mediaAlturas /= quantidade;
        porcentagemMenor16Anos /= quantidade;
        System.out.printf("Altura média: %.2f\n", mediaAlturas);
        System.out.printf("Pessoa com menos de 16 anos: %.2f %%\n", porcentagemMenor16Anos * 100);
        for(int i = 0 ; i < pessoa.length ; i++) {
            if(pessoa[i].getIdade() < 16) {
                System.out.println(pessoa[i].getNome());
            }
        }
        scanner.close();
    }
}
