package Lista04;

// Contar quantos números pares foram digitados (entre 10 valores)
import java.util.Scanner;
public class Exercicio05 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
// Contador de números pares
int pares = 0;
for (int i = 0; i < 10; i++) {
int n = sc.nextInt();
// Se o resto da divisão por 2 for 0, o número é par
if (n % 2 == 0) pares++;
        }
        System.out.println(pares);
        sc.close();
    }
}