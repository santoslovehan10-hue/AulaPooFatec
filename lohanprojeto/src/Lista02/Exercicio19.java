package Lista02;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Scanner para ler a temperatura do usuário
        System.out.print("Digite a temperatura: ");
        double temp = sc.nextDouble();
        if (temp < 15) {
            System.out.println("Está frio");
        } else if (temp <= 25) {
            System.out.println("Está agradável");
        } else {
            System.out.println("Está quente");
        }
        sc.close();
    }
}