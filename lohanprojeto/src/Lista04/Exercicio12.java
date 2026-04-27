package Lista04;

// Somar todos os elementos de uma matriz 3x3
import java.util.Scanner;
public class Exercicio12 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] m = new int[3][3];
int soma = 0;
// Lê os valores e já vai somando durante a leitura
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
m[i][j] = sc.nextInt();
        soma += m[i][j]; // acumula o valor lido na soma
    }
}
    System.out.println(soma);
        sc.close();
    }
}