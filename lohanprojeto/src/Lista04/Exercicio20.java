package Lista04;

// Calcular e exibir a soma de cada linha de uma matriz 3x3
import java.util.Scanner;
public class Exercicio20 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] m = new int[3][3];
// Preenche a matriz
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
        m[i][j] = sc.nextInt();
    }
}
// Para cada linha, zera a soma e percorre as colunas somando os elementos
for (int i = 0; i < 3; i++) {
int soma = 0;
for (int j = 0; j < 3; j++) {
    soma += m[i][j];
}
    System.out.println(soma);
}
        sc.close();
    }
}