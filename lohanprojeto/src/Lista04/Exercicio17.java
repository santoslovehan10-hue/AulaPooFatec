package Lista04;

// Multiplicar todos os elementos de uma matriz 3x3 por um escalar
import java.util.Scanner;
public class Exercicio17 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] m = new int[3][3];
// Preenche a matriz
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
        m[i][j] = sc.nextInt();
    }
}
// Lê o valor escalar pelo qual cada elemento será multiplicado
int x = sc.nextInt();
// Multiplica cada elemento pelo escalar e exibe o resultado
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
m[i][j] *= x; // equivale a: m[i][j] = m[i][j] * x
    System.out.print(m[i][j] + " ");
}
    System.out.println();
}
        sc.close();
    }
}