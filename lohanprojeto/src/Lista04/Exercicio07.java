package Lista04;

// Verificar se um valor digitado existe no array
import java.util.Scanner;
public class Exercicio07 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] v = new int[10];
// Flag que indica se o valor foi encontrado
boolean achou = false;
// Preenche o array
for (int i = 0; i < v.length; i++) {
v[i] = sc.nextInt();
    }
// Lê o valor a ser buscado
int x = sc.nextInt();
// Percorre o array procurando o valor
for (int i = 0; i < v.length; i++) {
if (v[i] == x) {
        achou = true;
    }
}
        System.out.println(achou);
        sc.close();
    }
}