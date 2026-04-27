package Lista04;

// Leitura de uma matriz 3x3
import java.util.Scanner;
public class Exercicio11 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
// Declara uma matriz com 3 linhas e 3 colunas
int[][] m = new int[3][3];
// Loop externo percorre as linhas, interno percorre as colunas
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
        m[i][j] = sc.nextInt();
    }
}
    sc.close();
    }
}