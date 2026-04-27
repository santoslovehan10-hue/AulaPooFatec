package Lista04;

// Somar duas matrizes 3x3 e exibir o resultado
import java.util.Scanner;
public class Exercicio18 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] a = new int[3][3]; // primeira matriz
int[][] b = new int[3][3]; // segunda matriz
int[][] c = new int[3][3]; // matriz resultado
// Preenche a primeira matriz
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
        a[i][j] = sc.nextInt();
    }
}
// Preenche a segunda matriz
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
        b[i][j] = sc.nextInt();
    }
}
// Soma elemento por elemento e exibe o resultado
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
c[i][j] = a[i][j] + b[i][j];
    System.out.print(c[i][j] + " ");
}
    System.out.println();
}
        sc.close();
    }
}