package Lista02;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Scanner para uma conta de matemática 
        System.out.print("Escolha o primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Escolha o segundo número: ");
        double b = sc.nextDouble();
        System.out.print("Digite a conta (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Resultado da soma: " + (a + b));
                break;

            case '-':
                System.out.println("Resultado da subtração: " + (a - b));
                break;

            case '*':
                System.out.println("Resultado da multiplicação: " + (a * b));
                break;

            case '/':
                if (b != 0) {
                    System.out.println("Resultado da divisão: " + (a / b));
                } else {
                    System.out.println("Divisão por zero não é permitida");
                }
                break;

            default:
                System.out.println("Operação inválida");
        }

        sc.close();
    }
}