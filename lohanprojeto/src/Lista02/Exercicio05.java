package Lista02;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        // O operador && garante que as DUAS condições sejam verdadeiras
        //Ele confere se o número está entre 10 e 50, ou seja, se é maior ou igual a 10 E menor ou igual a 50
        if (num >= 10 && num <= 50) {
            System.out.println("Dentro do intervalo (10-50)");
        } else {
            System.out.println("Fora do intervalo (10-50)");
        }

        sc.close();
    }
}