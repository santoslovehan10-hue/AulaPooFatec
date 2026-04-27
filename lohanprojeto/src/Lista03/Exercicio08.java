package Lista03;

// Calcular a média de uma quantidade de números informada pelo usuário
import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números deseja digitar? ");
        int quantidade = sc.nextInt();
        // Usamos double para suportar números com casas decimais
        double soma = 0;
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = sc.nextDouble();
            soma += numero;
        }
        // Divide a soma total pela quantidade de números informados
        double media = soma / quantidade;
        System.out.println("Média de todos os números digitados: " + media);
        sc.close();
    }
}