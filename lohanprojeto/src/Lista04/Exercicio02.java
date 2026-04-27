package Lista04;

// Soma dos elementos de um array de 10 números
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Variável acumuladora para somar os valores lidos
    int soma = 0;
    // Lê 10 números e vai somando diretamente, sem armazenar em array
    for (int i = 0; i < 10; i++) {
    soma += sc.nextInt();
        }
        System.out.println(soma);
        sc.close();
    }
}