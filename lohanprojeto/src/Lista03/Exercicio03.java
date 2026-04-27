package Lista03;

// Imprimir os números pares de 1 a 50
public class Exercicio03 {
    public static void main(String[] args) {
        // Percorre todos os números de 1 a 50
        for (int i = 1; i <= 50; i++) {
        // O operador % retorna o resto da divisão.
        // Se o resto de i dividido por 2 for 0, o número é par. 
        if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}