package Lista04;

// Ordenar um array de 10 elementos usando Bubble Sort
import java.util.Scanner;
public class Exercicio09 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] v = new int[10];
// Preenche o array
for (int i = 0; i < v.length; i++) {
    v[i] = sc.nextInt();
}
// Bubble Sort: compara elementos adjacentes e troca se necessário
// A cada passagem, o maior valor vai "subindo" para o final
for (int i = 0; i < v.length - 1; i++) {
for (int j = 0; j < v.length - 1; j++) {
if (v[j] > v[j + 1]) {
// Troca os valores usando uma variável temporária
int temp = v[j];
v[j] = v[j + 1];
v[j + 1] = temp;
        }
    }
}
// Exibe o array ordenado
for (int i = 0; i < v.length; i++) {
System.out.println(v[i]);
        }
        sc.close();
    }
}