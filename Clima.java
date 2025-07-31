package exercicio.alura;

public class Clima {
    int temperatura;
    int umidade;
    String condicao;

void exibeFicha() {
    if (temperatura >= 30) {
        System.out.println("Está quente");
    } else {
        System.out.println("Está frio");
    }
}
}
