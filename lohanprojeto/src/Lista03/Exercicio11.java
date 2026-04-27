package Lista03;

// Validar se o número digitado está entre 1 e 10
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        // O do-while garante que o programa fique pedindo até o usuário acertar
        do {
            System.out.print("Digite um número entre 1 e 10: ");
            numero = sc.nextInt();
            // Se o número estiver fora do intervalo, avisa o usuário e repete
            if (numero < 1 || numero > 10) {
                System.out.println("Número inválido, digite um número entre 1 e 10.");
            }
        } while (numero < 1 || numero > 10);
        System.out.println("Número válido: " + numero);
        sc.close();
    }
}