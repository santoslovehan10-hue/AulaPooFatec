package Lista05;

import java.util.Scanner;
public class Exercicio08 {
    public static String lerNome(Scanner scanner) {
    System.out.print("Qual o seu nome: ");
    return scanner.nextLine();
}
public static int lerIdade(Scanner scanner) {
    System.out.print("Qual a sua idade: ");
    return scanner.nextInt();
}
public static String lerCidade(Scanner scanner) {
    scanner.nextLine();
    System.out.print("Qual a sua cidade: ");
    return scanner.nextLine();
}
public static void mostrarResumo(String nome, int idade, String cidade) {
    System.out.println("Seu nome é " + nome);
    System.out.println("Sua idade é " + idade);
    System.out.println("Sua cidade é " + cidade);
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String nome = lerNome(scanner);
    int idade = lerIdade(scanner);
    String cidade = lerCidade(scanner);
    mostrarResumo(nome, idade, cidade);
    scanner.close();
    }
}