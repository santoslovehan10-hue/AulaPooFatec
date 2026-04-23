import java.util.Random;
import java.util.Scanner;

public class JogodaAdivinhacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String opcao = "s";

        System.out.println("Jogo da Adivinhação");

        while (opcao.equalsIgnoreCase("s")) {

            int numeroSorteado = random.nextInt(100) + 1;
            int tentativa = 0;
            int totalTentativas = 0;
            int maxTentativas = 5;

            System.out.println("\nUm número entre 1 e 100 foi sorteado.");
            System.out.println("Você tem " + maxTentativas + " tentativas.");

            while (tentativa != numeroSorteado && totalTentativas < maxTentativas) {
                System.out.print("Digite um número: ");
                tentativa = scanner.nextInt();
                totalTentativas++;

                if (tentativa < 1 || tentativa > 100) {
                    System.out.println("Digite um número entre 1 e 100.");
                } else if (tentativa < numeroSorteado) {
                    System.out.println("O número sorteado é maior.");
                } else if (tentativa > numeroSorteado) {
                    System.out.println("O número sorteado é menor.");
                } else {
                    System.out.println("Você acertou o número.");
                    System.out.println("Número sorteado: " + numeroSorteado);
                    System.out.println("Quantidade de tentativas: " + totalTentativas);
                }
            }

            if (tentativa != numeroSorteado) {
                System.out.println("\nVocê atingiu o limite de tentativas.");
                System.out.println("Número sorteado: " + numeroSorteado);
            }

            System.out.print("\nDeseja jogar novamente? (s/n): ");
            opcao = scanner.next();
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}