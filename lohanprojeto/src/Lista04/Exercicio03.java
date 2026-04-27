package Lista04;

// Encontra o maior e o menor valor de um array de 8 elementos
import java.util.Scanner;
public class Exercicio03 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] v = new int[8];
// Preenche o array com os valores digitados
for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }
// Inicializa maior e menor com o primeiro elemento do array
int maior = v[0];
int menor = v[0];
// Percorre o restante do array comparando os valores
for (int i = 1; i < v.length; i++) {
if (v[i] > maior) maior = v[i];
if (v[i] < menor) menor = v[i];
        }
        System.out.println("Maior número é: " + maior);
        System.out.println("Menor número é: " + menor);
        sc.close();
    }
}