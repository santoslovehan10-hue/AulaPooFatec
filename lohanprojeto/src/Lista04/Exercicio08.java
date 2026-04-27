package Lista04;

// Contar quantas vezes um valor aparece no array
import java.util.Scanner;
public class Exercicio08 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] v = new int[10];
// Contador de ocorrências do valor buscado
int count = 0;
// Preenche o array
for (int i = 0; i < v.length; i++) {
v[i] = sc.nextInt();
}
// Lê o valor a ser contado
int x = sc.nextInt();
// Conta quantas vezes x aparece no array
for (int i = 0; i < v.length; i++) {
if (v[i] == x) count++;
}
        System.out.println(count);
        sc.close();
    }
}