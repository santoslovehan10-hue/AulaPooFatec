package Lista03;

// Tabuada de um número que será digitado aleatoriamente
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        // Scanner é usado para capturar o que o usuário digita no console
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha um número: ");
        int numero = sc.nextInt();
        // O loop vai de 1 a 10, multiplicando "numero" por cada valor de "i"
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        sc.close(); // Boa prática: fechar o Scanner após o uso
    }
}