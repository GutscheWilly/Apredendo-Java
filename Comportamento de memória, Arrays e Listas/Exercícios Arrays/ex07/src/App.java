import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas pessoa deseja informar? ");
        int quantidade = scanner.nextInt();
        Pessoa[] pessoa = new Pessoa[quantidade];
        for(int i = 0 ; i < pessoa.length ; i++) {
            System.out.println("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.println("Idade: ");
            int idade = scanner.nextInt();
            pessoa[i] = new Pessoa(nome, idade);
        }
        int indexMaisvelho = 0;
        int maiorIdade = pessoa[0].getIdade();
        for(int i = 1 ; i < pessoa.length ; i++) {
            if(pessoa[i].getIdade() > maiorIdade) {
                maiorIdade = pessoa[i].getIdade();
                indexMaisvelho = i;
            }
        }
        System.out.printf("Pessoa mais velha ->  Nome: %s  |  Idade: %d\n", pessoa[indexMaisvelho].getNome(), maiorIdade);
        scanner.close();
    }
}
