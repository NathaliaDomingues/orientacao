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
        jogo.avalia(8);
        jogo.avalia(2);
        System.out.println("Deixe sua nota:");
        int notaUsuario = scanner.nextInt();
        jogo.avalia(notaUsuario);
        System.out.println("A média é " + jogo.media());
    }
}
