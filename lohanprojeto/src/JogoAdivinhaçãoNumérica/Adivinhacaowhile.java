package JogoAdivinhaçãoNumérica;

import java.util.Scanner;

public class Adivinhacaowhile {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int numeroSecreto = (int)(Math.random() * 100) + 1;
int tentativas = 0;
int maxTentativas = 10;
boolean acertou = false;
System.out.println("Jogo da Adivinhacao (WHILE)!");
while (tentativas < maxTentativas && !acertou) {
System.out.print("Tentativa " + (tentativas + 1) + ": ");
int palpite = sc.nextInt();
tentativas++;
if (palpite == numeroSecreto) {
System.out.println("Acertou em " + tentativas + " tentativas!");
acertou = true;
} else if (palpite > numeroSecreto) {
System.out.println("O numero secreto e menor!");
} else {
System.out.println("O numero secreto e maior!");
    }
}
if (!acertou) {
System.out.println("Voce perdeu! O numero era: " + numeroSecreto);
}
sc.close();
    }
}