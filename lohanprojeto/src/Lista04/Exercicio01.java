package Lista04;

// Leitura e exibição de um array de 5 elementos
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Cria um array de inteiros com 5 posições
    int[] v = new int[5];
    // Preenche o array com os valores digitados pelo usuário
    for (int i = 0; i < v.length; i++) {
    v[i] = sc.nextInt();
        }
    // Exibe cada elemento do array
    for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
        sc.close();
    }
}