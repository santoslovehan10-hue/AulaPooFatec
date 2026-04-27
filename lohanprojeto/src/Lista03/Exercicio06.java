package Lista03;

// Encontrar o maior número entre 5 valores digitados
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Integer.MIN_VALUE é o menor inteiro possível no Java (-2.147.483.648)
        // Assim garantimos que qualquer número digitado será maior que o inicial
        int maior = Integer.MIN_VALUE;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = sc.nextInt();
            // Sempre que encontrar um número maior que o atual, atualiza a variável
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("Maior número é o: " + maior);
        sc.close();
    }
}