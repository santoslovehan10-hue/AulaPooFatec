package Lista02;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Scanner para ler o salário do usuário
        System.out.print("Digite o seu salário: ");
        double salario = sc.nextDouble();
        double imposto;
        if (salario <= 2000) {
            imposto = 0;
        } else if (salario <= 5000) {
            imposto = salario * 0.10;
        } else {
            imposto = salario * 0.20;
        }
        System.out.println("Imposto a ser pago: R$ " + imposto);
        sc.close();
    }
}