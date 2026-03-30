package Lista02;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Scanner pra ver os lados do triângulo
        System.out.print("Digite o primeiro lado: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo lado: ");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro lado: ");
        int c = sc.nextInt();

        // Verifica se forma um triângulo
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo");
        }
        sc.close();
    }
}