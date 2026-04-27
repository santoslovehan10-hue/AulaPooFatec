package Lista04;

// Rotacionar uma matriz 3x3 em 90 graus no sentido horário
import java.util.Scanner;
public class Exercicio23 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] m = new int[3][3]; // matriz original
int[][] r = new int[3][3]; // matriz rotacionada
// Preenche a matriz original
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
        m[i][j] = sc.nextInt();
    }
}
// Fórmula da rotação 90° horário: r[j][2-i] = m[i][j]
// O elemento da linha i, coluna j vai para a linha j, coluna (2-i)
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
        r[j][2 - i] = m[i][j];
    }
}
// Exibe a matriz rotacionada
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
    System.out.print(r[i][j] + " ");
}
    System.out.println();
}
        sc.close();
    }
}