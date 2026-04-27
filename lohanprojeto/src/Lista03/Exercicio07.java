package Lista03;

// Contar quantos números positivos e negativos foram digitados
import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Contadores que começam em zero e vão sendo incrementados
        int positivos = 0;
        int negativos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = sc.nextInt();
            // Verifica o sinal do número e incrementa o contador correspondente
            if (numero > 0) {
                positivos++; // positivos = positivos + 1
            } else if (numero < 0) {
                negativos++; // negativos = negativos + 1
            }
            // Se for 0, não conta em nenhuma categoria
        }
        System.out.println("A quantidade de números positivos é: " + positivos);
        System.out.println("A quantidade de números negativos é: " + negativos);
        sc.close();
    }
}