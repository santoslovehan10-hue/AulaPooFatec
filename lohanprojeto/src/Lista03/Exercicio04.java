package Lista03;

// Soma de todos os números de 1 até 100
public class Exercicio04 {
    public static void main(String[] args) {
        // Variável acumuladora que vai guardando a soma a cada iteração
        int Resultadodasoma = 0;
        // A cada repetição, soma o valor atual de "i" à variável soma
        for (int i = 1; i <= 100; i++) {
        Resultadodasoma += i; // equivale a: Resultadodasoma = Resultadodasoma + i
        }
        System.out.println("Resultado igual à: " + Resultadodasoma);
    }
}