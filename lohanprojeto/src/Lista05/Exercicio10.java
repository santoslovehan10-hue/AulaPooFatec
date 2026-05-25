package Lista05;

import java.util.Scanner;
public class Exercicio10 {
    public static String lerUsuario(Scanner scanner) {
    System.out.print("Qual seu usuário: ");
    return scanner.nextLine();
}
    public static String lerSenha(Scanner scanner) {
    System.out.print("Qual sua senha: ");
    return scanner.nextLine();
}
    public static boolean validarLogin(String usuario, String senha) {
    return usuario.equals("Lohan") && senha.equals("321");
}
public static void mostrarResultado(boolean valido) {
if (valido) {
    System.out.println("Bem-vindo de volta, Lohan!");
} else {
    System.out.println("Usuário ou senha inválidos. Tente novamente");
    }
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String usuario = lerUsuario(scanner);
    String senha = lerSenha(scanner);
    boolean valido = validarLogin(usuario, senha);
    mostrarResultado(valido);
    scanner.close();
    }
}