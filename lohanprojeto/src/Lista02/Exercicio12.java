package Lista02;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Escrever um número e ele vai escolher o dia da semana correspondente, se for um número diferente é inválido
        System.out.print("Escolha um número de 1 a 7: ");
        int dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("1 é odomingo");
                break;
            case 2:
                System.out.println("2 é a segunda-feira");
                break;
            case 3:
                System.out.println("3 é a terça-feira");
                break;
            case 4:
                System.out.println("4 é a quarta-feira");
                break;
            case 5:
                System.out.println("5 é a quinta-feira");
                break;
            case 6:
                System.out.println("6 é a sexta-feira");
                break;
            case 7:
                System.out.println("7 é o sábado");
                break;
            default:
                System.out.println("Número inválido (escolha de 1 a 7)");
        }
        sc.close();
    }
}