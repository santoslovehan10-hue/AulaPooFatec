package Lista04;

// Verificar se uma matriz 3x3 não possui valores repetidos (Sudoku simplificado)
import java.util.Scanner;
public class Exercicio22 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] m = new int[3][3];
boolean valido = true;
// Preenche a matriz
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
        m[i][j] = sc.nextInt();
    }
}
// Compara cada elemento com todos os outros da matriz
// Se dois elementos diferentes tiverem o mesmo valor, marca como inválido
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
for (int x = 0; x < 3; x++) {
for (int y = 0; y < 3; y++) {
// (i != x || j != y) garante que não comparamos o elemento com ele mesmo
if ((i != x || j != y) && m[i][j] == m[x][y]) {
                    valido = false;
                }
            }
        }
    }
}
System.out.println(valido);
        sc.close();
    }
}