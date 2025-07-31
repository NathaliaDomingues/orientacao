package exercicio.alura;

public class Mainp {
    public static void main(String[] args) {
        Porta porta = new Porta();

        porta.cor = "Marrom escuro";
        porta.material = "Madeira de carvalho";
        porta.statusDaPorta = "Aberta";

        System.out.println("===================================");
        System.out.println("Porta");
        System.out.println("Cor: " + porta.cor);
        System.out.println("Material: " + porta.material);
        porta.setStatusDaPorta();
        System.out.println("===================================");
    }
}
