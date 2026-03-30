package Lista02;

import java.util.Scanner;

public class Exercicio15 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Scanner para ler o peso e a altura do usuário
        System.out.print("Digite o seu peso em kg: ");
        double peso = sc.nextDouble();
        System.out.print("Digite a sua altura em metros: ");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Você está com peso normal");
        } else if (imc < 30) {
            System.out.println("Você está com sobrepeso");
        } else {
            System.out.println("Você está obeso");
        }
        sc.close();
    }
}