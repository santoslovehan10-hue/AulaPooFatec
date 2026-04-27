package Lista03;

// Somar números digitados até o usuário digitar 0
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int numero;
        // O do-while executa o bloco PRIMEIRO e só verifica a condição depois
        // Ideal aqui porque queremos pedir o número antes de verificar se é 0
        do {
            System.out.print("Digite um número ou digite 0 para sair e somar tudo: ");
            numero = sc.nextInt();
            soma += numero;
        } while (numero != 0); // Continua enquanto o número for diferente de 0
        System.out.println("Soma total dos números: " + soma);
        sc.close();
    }
}