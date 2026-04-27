package Lista03;

// Calcular o fatorial de um número
import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();
        // O fatorial começa em 1 porque multiplicar por 0 zeraria o resultado
        int fatorial = 1;
        // O loop vai do número digitado até 1, multiplicando tudo
        // Ex: 5! = 5 x 4 x 3 x 2 x 1 = 120
        for (int i = numero; i >= 1; i--) {
            fatorial *= i; // equivale a: fatorial = fatorial * i
        }
        System.out.println("O fatorial do número " + numero + " é: " + fatorial);
        sc.close();
    }
}