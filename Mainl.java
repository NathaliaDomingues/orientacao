package exercicio.alura;

public class Mainl {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = "A Festa do Bode";
        livro.autor = "Mario Vargas Llosa";
        livro.anoPublicacao = 2000;
        livro.paginas = 456;
        livro.anoLivro2 = 1943;
        livro.outroLivro = "O Pequeno Príncipe";

        livro.exibeFichaTecnica();
        livro.idade();
    }
}
