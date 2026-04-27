package Lista03;

// Contagem regressiva de 10 até 1
public class Exercicio02 {
    public static void main(String[] args) {
        // O loop começa em 10 e vai diminuindo de 1 em 1 até chegar em 1. A diferença desse pra o Exercicio01 é o sinal de maior ou igual a 1 e o "--""
        for (int i = 10; i >= 1; i--) {
        // Imprime o valor atual de "i" a cada repetição
            System.out.println(i);
        }
    }
}