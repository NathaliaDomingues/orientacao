package exercicio.alura;

import java.util.Scanner;

public class Mainj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogo jogo = new Jogo();

        jogo.nome = "Sonic";
        jogo.anoLancamento = 1991;
        jogo.categoria = "Fantasia";

        jogo.exibeFichaTecnica();
        jogo.avalia(6);
        jogo.avalia(9);
        jogo.avalia(10);
        System.out.println("Deixe sua nota:");
        String avaliacao = scanner.nextLine();
        System.out.println("A média é " + jogo.media());
    }
}
