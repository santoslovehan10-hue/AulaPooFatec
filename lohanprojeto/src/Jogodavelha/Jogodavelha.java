package Jogodavelha;

import java.util.Scanner;

public class Jogodavelha {
    private static final int N = 3;
    private static final Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
char[][] tab = new char[N][N];
limpar(tab);
char jogador = 'X';
System.out.println("=== Jogo da Velha (matriz) ===");
imprimeGuia();
while (true) {
imprime(tab);
int[] pos = lerJogadaValida(tab, jogador);
tab[pos[0]][pos[1]] = jogador;
if (venceu(tab, jogador)) {
imprime(tab);
System.out.println("Parabéns " + jogador + ", você venceu!");
break;
}
if (empate(tab)) {
imprime(tab);
System.out.println("Esse jogo deu empate!");
break;
}
jogador = (jogador == 'X') ? 'O' : 'X';
}
sc.close();
}
private static void limpar(char[][] t) {
for (int i = 0; i < N; i++)
for (int j = 0; j < N; j++)
t[i][j] = ' ';
}
private static void imprimeGuia() {
System.out.println("Informe linha e coluna (1 a 3). Ex.: \"2 3\" coloca na linha 2, coluna 3.");
System.out.println();
}
private static void imprime(char[][] t) {
for (int i = 0; i < N; i++) {
System.out.print(" ");
for (int j = 0; j < N; j++) {
System.out.print(t[i][j]);
if (j < N - 1) System.out.print(" | ");
}
System.out.println();
    if (i < N - 1) System.out.println("---+---+---");
    }
}
private static int[] lerJogadaValida(char[][] t, char jogador) {
while (true) {
System.out.print("Jogador " + jogador + " (linha coluna 1-3): ");
if (!sc.hasNextInt()) { sc.next(); System.out.println("Linha inválida."); continue; }
int lin = sc.nextInt();
if (!sc.hasNextInt()) { sc.next(); System.out.println("Coluna inválida."); continue; }
int col = sc.nextInt();
if (lin < 1 || lin > 3 || col < 1 || col > 3) {
System.out.println("Posição inválida! Digite valores entre 1 e 3.");
continue;
}
if (t[lin - 1][col - 1] != ' ') {
System.out.println("Casa já ocupada! Escolha outra.");
continue;
}
    return new int[]{lin - 1, col - 1};
    }
}
private static boolean venceu(char[][] t, char jogador) {
    for (int i = 0; i < N; i++) {
    if (t[i][0] == jogador && t[i][1] == jogador && t[i][2] == jogador) return true;
    if (t[0][i] == jogador && t[1][i] == jogador && t[2][i] == jogador) return true;
}
if (t[0][0] == jogador && t[1][1] == jogador && t[2][2] == jogador) return true;
if (t[0][2] == jogador && t[1][1] == jogador && t[2][0] == jogador) return true;
    return false;
}
private static boolean empate(char[][] t) {
    for (int i = 0; i < N; i++)
    for (int j = 0; j < N; j++)
    if (t[i][j] == ' ') return false;
    return true;
    }
}