package Lista04;

// Estrutura base de um Jogo da Velha (tabuleiro 3x3)
import java.util.Scanner;
public class Exercicio21 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
// Matriz de chars para representar o tabuleiro
char[][] jogo = new char[3][3];
// Inicializa todas as posições com '-' representando espaço vazio
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
        jogo[i][j] = '-';
    }
}
// Exibe o tabuleiro inicial linha por linha
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
    System.out.print(jogo[i][j] + " ");
}
    System.out.println();
}
        sc.close();
    }
}