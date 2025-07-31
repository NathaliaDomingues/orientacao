package exercicio.alura;

public class Mainpr {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Sabonete";
        produto.preco = 13.99;
        produto.estoque = 100;

        System.out.println("--------------------");
        System.out.println(produto.nome);
        System.out.println("R$" + produto.preco);
        System.out.println("Estoque: " + produto.estoque);
        System.out.println("--------------------");
        System.out.println(produto.calcularValorTotalemEstoque());

        produto.calcularValorTotalemEstoque();
        produto.descontoAplicado(20);
    }
}
