package Lista04;

// Exibir os elementos de um array de 5 posições na ordem inversa
import java.util.Scanner;
public class Exercicio06 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] v = new int[5];
// Preenche o array com os valores digitados
for (int i = 0; i < v.length; i++) {
        v[i] = sc.nextInt();
    }
// Percorre o array de trás pra frente para exibir em ordem inversa
for (int i = v.length - 1; i >= 0; i--) {
            System.out.println(v[i]);
        }
        sc.close();
    }
}