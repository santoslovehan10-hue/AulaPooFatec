package Lista02;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        //Scanner para ler a opção do usuário e os números para as operações
        do {
            System.out.println("\nMenu");
            System.out.println("Digite 1 para somar");
            System.out.println("Digite 2 para subtrair");
            System.out.println("Digite 3 para sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
        if (opcao == 1 || opcao == 2) {
                System.out.print("Digite o seu primeiro número: ");
                int n1 = sc.nextInt();
                System.out.print("Digite o seu segundo número: ");
                int n2 = sc.nextInt();
        if (opcao == 1) {
                System.out.println("Resultado: " + (n1 + n2));
                } else {
                    System.out.println("Resultado: " + (n1 - n2));
                }
            } else if (opcao == 3) {
                System.out.println("Encerrando...");
            } else {
                System.out.println("Opção inválida, digite do 1 a 3");
            }
        } while (opcao != 3);
        sc.close();
    }
}