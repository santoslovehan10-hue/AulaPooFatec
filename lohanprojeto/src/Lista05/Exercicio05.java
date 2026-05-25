package Lista05;

import java.util.Scanner;
public class Exercicio05 {
public static void mostrarMenu() {
    System.out.println("Digite 1 para Somar");
    System.out.println("Digite 2 para Subtrair");
    System.out.println("Digite 3 para Multiplicar");
    System.out.println("Digite 4 para Dividir");
}
public static double lerNumero(Scanner scanner) {
System.out.print("Digite um número: ");
return scanner.nextDouble();
}
public static double somar(double a, double b) {
return a + b;
}
public static double subtrair(double a, double b) {
return a - b;
}
public static double multiplicar(double a, double b) {
return a * b;
}
public static double dividir(double a, double b) {
if (b == 0) {
System.out.println("Erro: divisão por zero.");
return 0;
}
    return a / b;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
mostrarMenu();
System.out.print("Escolha uma opção: ");
int opcao = scanner.nextInt();
double n1 = lerNumero(scanner);
double n2 = lerNumero(scanner);
if (opcao == 1) {
    System.out.println("Resultado da soma: " + somar(n1, n2));
} else if (opcao == 2) {
    System.out.println("Resultado da subtração: " + subtrair(n1, n2));
} else if (opcao == 3) {
    System.out.println("Resultado da multiplicação: " + multiplicar(n1, n2));
} else if (opcao == 4) {    
    System.out.println("Resultado da divisão: " + dividir(n1, n2));
} else {
    System.out.println("Opção inválida.");
}
    scanner.close();
    }
}