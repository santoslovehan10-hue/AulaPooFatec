package Lista04;

// Somar os elementos da diagonal principal de uma matriz 3x3
import java.util.Scanner;
public class Exercicio13 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] m = new int[3][3];
int soma = 0;
// Preenche a matriz
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
        m[i][j] = sc.nextInt();
    }
}
// Na diagonal principal, o índice da linha é igual ao da coluna (i == j)
// Ou seja: m[0][0], m[1][1], m[2][2]
for (int i = 0; i < 3; i++) {
    soma += m[i][i];
}
    System.out.println(soma);
        sc.close();
    }
}