package Lista02;

import java.util.Scanner;

public class Exercicioextra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Scanner para ler o usuário e senha, comparando com os valores corretos. Se o login for bem-sucedido, exibir um menu com as opções de ver saldo, depositar, sacar e sair. O saldo inicial é de R$ 1000,00. O usuário pode realizar depósitos e saques, e o sistema deve validar as operações (não permitir saques maiores que o saldo ou depósitos negativos). O programa deve continuar exibindo o menu até que o usuário escolha a opção de sair.
        String usuarioCorreto = "Lohan";
        String senhaCorreta = "220205";
        System.out.print("Digite seu usuário: ");
        String usuario = sc.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();
        if (!usuario.equals(usuarioCorreto) || !senha.equals(senhaCorreta)) {
            System.out.println("Login inválido");
            sc.close();
            return;
        }
        System.out.println("Login realizado com sucesso!");
        double saldo = 1000.0;
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso");
                        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Valor inválido");
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor do saque: ");
                    double saque = sc.nextDouble();
                    if (saque <= 0) {
                        System.out.println("Valor inválido");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso");
                        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    }
                    break;
                case 4:
                    System.out.println("Sistema encerrado");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 4);
        sc.close();
    }
}