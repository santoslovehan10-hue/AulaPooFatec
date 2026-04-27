package Lista04;

// Buscar um valor em uma matriz 5x5 e exibir sua posição
import java.util.Scanner;
public class Exercicio24 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] m = new int[5][5];
// Preenche a matriz 5x5
for (int i = 0; i < 5; i++) {
for (int j = 0; j < 5; j++) {
        m[i][j] = sc.nextInt();
    }
}
// Lê o valor a ser buscado
int x = sc.nextInt();
// Percorre a matriz e exibe a posição sempre que encontrar o valor
for (int i = 0; i < 5; i++) {
for (int j = 0; j < 5; j++) {
if (m[i][j] == x) {
            System.out.println("Encontrado em: " + i + "," + j);
        }
    }
}
        sc.close();
    }
}