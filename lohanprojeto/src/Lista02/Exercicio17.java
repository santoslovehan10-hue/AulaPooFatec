package Lista02;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //
        String usuarioCorreto = "Lohan";
        String senhaCorreta = "220205";
        boolean acessoPermitido = false;
        for (int tentativa = 1; tentativa <= 3; tentativa++) {
            System.out.println("Tentativa " + tentativa + " de 3");
            System.out.print("Seu usuário: ");
            String usuario = sc.nextLine();
            System.out.print("Senha: ");
            String senha = sc.nextLine();
        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                acessoPermitido = true;
                System.out.println("Bem-vindo de volta, " + usuarioCorreto + "!");
            break;
        } else {
                System.out.println("Dados incorretos, tente novamente");
            }
        }
        if (!acessoPermitido) {
            System.out.println("Conta bloqueada");
        }
        sc.close();
    }
}