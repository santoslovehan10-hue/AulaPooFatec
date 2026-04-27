package Lista03;

// Menu interativo com opções de somar, subtrair ou sair
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        // O menu fica aparecendo em loop até o usuário escolher a opção 3 (Sair)
        do {
            // Exibe as opções disponíveis
            System.out.println("Digite 1 para somar");
            System.out.println("Digite 2 para subtrair");
            System.out.println("Digite 3 para sair");
            System.out.print("Escolha uma destas 3 opções:");
            opcao = sc.nextInt();
            if (opcao == 1) {
                // Opção 1: lê dois números e exibe a soma
                System.out.print("Digite o primeiro número: ");
                int a = sc.nextInt();
                System.out.print("Digite o segundo número: ");
                int b = sc.nextInt();
                System.out.println("Resultado da soma: " + (a + b));
            } else if (opcao == 2) {
                // Opção 2: lê dois números e exibe a subtração
                System.out.print("Digite o primeiro número: ");
                int a = sc.nextInt();
                System.out.print("Digite o segundo número: ");
                int b = sc.nextInt();
                System.out.println("Resultado da subtração: " + (a - b));
            } else if (opcao == 3) {
                // Opção 3: encerra o programa
                System.out.println("Encerrando o programa...");
            } else {
                // Qualquer outro valor digitado é considerado inválido
                System.out.println("Opção inválida. Escolha um número de 1 a 3");
            }
        } while (opcao != 3); // Repete enquanto o usuário não escolher sair
        sc.close();
    }
}