package exercicio.alura;
//4.CLASSE PRODUTO
public class Produto {
    String nome;
    double preco;
    int estoque;

    public double calcularValorTotalemEstoque() {
        return preco * estoque;
    }

    public void descontoAplicado(double percentual) {
        if (percentual > 0 || percentual <= 100) {
            preco -= preco * (percentual / 100);
            System.out.println("Desconto aplicado: " + preco);
        } else {
            System.out.println("Desconto inválido");
        }
    }
}
