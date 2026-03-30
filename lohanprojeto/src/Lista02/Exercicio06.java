package Lista02;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Aqui eu identifico qual a faixa etária da pessoa, de acordo com a idade que eu escrevo
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("É uma criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("É um adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("É um adulto");
        } else if (idade >= 60) {
            System.out.println("É um idoso");
        } else {
            System.out.println("Idade inválida");
        }

        sc.close();
    }
}