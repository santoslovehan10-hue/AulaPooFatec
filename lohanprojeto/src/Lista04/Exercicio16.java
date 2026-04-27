package Lista04;

// Exibir a transposta de uma matriz 3x3
// Na transposta, linhas viram colunas e colunas viram linhas
import java.util.Scanner;
public class Exercicio16 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] m = new int[3][3];
// Preenche a matriz original
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
        m[i][j] = sc.nextInt();
    }
}
// Exibe a transposta: troca i por j na leitura (m[j][i] em vez de m[i][j])
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
    System.out.print(m[j][i] + " ");
}
    System.out.println();
}
    sc.close();
    }
}