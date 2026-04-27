package Lista04;

// Encontrar o maior valor em uma matriz 4x4
import java.util.Scanner;
public class Exercicio14 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] m = new int[4][4];
// Inicializa com o menor inteiro possível para garantir a comparação correta
int maior = Integer.MIN_VALUE;
// Preenche a matriz e já verifica o maior valor durante a leitura
for (int i = 0; i < 4; i++) {
for (int j = 0; j < 4; j++) {
m[i][j] = sc.nextInt();
if (m[i][j] > maior) {
maior = m[i][j];
        }
    }
}
    System.out.println(maior);
        sc.close();
    }
}