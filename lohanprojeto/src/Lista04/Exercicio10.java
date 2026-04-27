package Lista04;

// Exibir apenas os elementos não repetidos do array
import java.util.Scanner;
public class Exercicio10 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] v = new int[10];
// Preenche o array
for (int i = 0; i < v.length; i++) {
    v[i] = sc.nextInt();
}
// Para cada elemento, verifica se ele já apareceu antes no array
for (int i = 0; i < v.length; i++) {
boolean repetido = false;
// Compara com todos os elementos anteriores
for (int j = 0; j < i; j++) {
if (v[i] == v[j]) repetido = true;
    }
// Só imprime se não for repetido
if (!repetido) {
        System.out.println(v[i]);
    }
}
        sc.close();
    }
}