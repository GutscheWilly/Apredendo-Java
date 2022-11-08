import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        Hospede[] quartoHospede = new Hospede[quantidadeQuartos];
        System.out.print("Quantos quartos serão alugado? ");
        int quantidadeHospedes = scanner.nextInt();
        for(int i = 0 ; i < quantidadeHospedes ; i++) {
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("E-mail: ");
            String email = scanner.nextLine();
            System.out.print("Qual o número do quarto que deseja alugar? ");
            int numeroQuartoAlugado = scanner.nextInt();
            quartoHospede[numeroQuartoAlugado] = new Hospede(nome, email);
        }
        System.out.println("Quartos alugados: ");
        for(int i = 0 ; i < quartoHospede.length ; i++) {
            if(quartoHospede[i] != null) {
                System.out.printf("Quarto %d -> " + quartoHospede[i].toString(), i);
            }
        }
        scanner.close();
    }

    private static int quantidadeQuartos = 10;
}
