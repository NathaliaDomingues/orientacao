package exercicio.alura;
//2.CLASSE LIVRO
public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    int paginas;
    int anoLivro;
    int anoLivro2;
    String outroLivro;

    void exibeFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Quantidade de páginas: " + paginas);
    }

    void idade() {
        anoLivro = 2025 - anoPublicacao;
        System.out.println("Quantos anos tem o livro: " + anoLivro);

        if (anoLivro > 2000) {
            System.out.println("O livro é mais antigo");
        } else {
            System.out.println("O livro é mais atual");
        }
    }
}
