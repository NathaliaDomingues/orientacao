package exercicio.alura;
//5.CLASSE JOGO
public class Jogo {
    String nome;
    int anoLancamento;
    String categoria;
    double avaliacao;
    int totalAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println(nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Categoria: " + categoria);
    }

    public void avalia(double nota) {
        avaliacao += nota;
        totalAvaliacoes++;
    }

    public double media() {
        return avaliacao / totalAvaliacoes;
    }
}
