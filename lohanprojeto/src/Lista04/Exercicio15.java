package Lista04;

// Contar quantos números pares existem em uma matriz 3x3
import java.util.Scanner;
public class Exercicio15 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] m = new int[3][3];
int pares = 0;
// Lê os valores e verifica se cada um é par durante a leitura
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
m[i][j] = sc.nextInt();
// Se o resto da divisão por 2 for 0, o número é par
if (m[i][j] % 2 == 0) pares++;
    }
}
    System.out.println(pares);
    sc.close();
    }
}