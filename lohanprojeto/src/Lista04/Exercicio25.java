package Lista04;

// Somar os elementos da diagonal secundária de uma matriz 3x3
// Diagonal secundária: m[0][2], m[1][1], m[2][0]
import java.util.Scanner;
public class Exercicio25 {
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
// Na diagonal secundária, a coluna é calculada como (tamanho - 1) - i
// Ou seja: m[0][2], m[1][1], m[2][0]
for (int i = 0; i < 3; i++) {
    soma += m[i][2 - i];
}
        System.out.println(soma);
        sc.close();
    }
}