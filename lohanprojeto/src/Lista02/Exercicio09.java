package Lista02;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Scanner para saber usuário e senha se são corretos 
        System.out.print("Digite o seu usuário: ");
        String usuario = sc.nextLine();
        System.out.print("Digite a sua senha: ");
        String senha = sc.nextLine();

        if (usuario.equals("Lohan") && senha.equals("220205")) {
            System.out.println("Bem-vindo de volta Lohan!");
        } else {
            System.out.println("Senha e usuários incorretos, tente novamente");
        }
        sc.close();
    }
}