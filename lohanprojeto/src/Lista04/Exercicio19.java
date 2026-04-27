package Lista04;

// Verificar se uma matriz 3x3 é uma matriz identidade
// Matriz identidade: diagonal principal com 1s e o restante com 0s
import java.util.Scanner;
public class Exercicio19 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] m = new int[3][3];
boolean identidade = true;
// Preenche a matriz
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
        m[i][j] = sc.nextInt();
    }
}
// Verifica as condições da matriz identidade
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
// Diagonal principal deve ter valor 1
if (i == j && m[i][j] != 1) identidade = false;
// Fora da diagonal deve ter valor 0
        if (i != j && m[i][j] != 0) identidade = false;
    }
}
System.out.println(identidade);
    sc.close();
    }
}