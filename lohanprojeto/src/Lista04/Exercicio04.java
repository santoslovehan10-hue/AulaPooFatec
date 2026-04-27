package Lista04;

// Calcular a média de 6 números que eu digitar
import java.util.Scanner;
public class Exercicio04 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
// Usamos double para suportar números com casas decimais
double soma = 0;
// Lê 6 números e acumula a soma
for (int i = 0; i < 6; i++) {
        soma += sc.nextDouble();
    }
// Divide a soma pela quantidade de números para obter a média
System.out.println(soma / 6);
        sc.close();
    }
}