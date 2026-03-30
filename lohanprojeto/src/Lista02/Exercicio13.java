package Lista02;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Scanner para identificar se o ano é bissexto ou não
        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Esse ano bissexto");
        } else {
            System.out.println("Esse ano não é bissexto");
        }
        sc.close();
    }
}