package exercicio.alura;

public class Clima {
    int temperatura;
    int umidade;
    String condicao;
    int temperaturaUsuario;

void exibeFicha() {
    if (30 > temperaturaUsuario) {
        System.out.println("Está quente");
    } else {
        System.out.println("Está frio");
    }
    }
}
