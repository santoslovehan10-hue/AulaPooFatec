package Lista02;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Scanner pra saber o valor for igual ou maior que 100 para aplicar o desconto 
        System.out.print("Digite o valor da sua compra: ");
        double valor = sc.nextDouble();
        double valorFinal;

        if (valor >= 100) {
            valorFinal = valor * 0.9;
        } else {
            valorFinal = valor;
        }

        System.out.println("Valor final com desconto aplicado: R$ " + valorFinal);
        sc.close();
    }
}