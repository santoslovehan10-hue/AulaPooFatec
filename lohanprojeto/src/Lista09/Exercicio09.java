package Lista09;

public class Exercicio09 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int aux; // Variável temporária

        aux = a; // aux guarda o 5
        a = b;   // a vira 10
        b = aux; // b vira o 5 que estava no aux

        System.out.println("a = " + a + " b = " + b);
    }
}