package exercicio.alura;
//3.CLASSE CLIMA
public class Mainc {
    public static void main(String[] args) {
        Clima clima = new Clima();

        clima.temperatura = 30;
        clima.umidade = 10;
        clima.condicao = "Ensolarado";

        System.out.println("A temperatura está: " + clima.temperatura + "°C");
        System.out.println("Umidade: " + clima.umidade + "%");
        System.out.println("Condicao: " + clima.condicao);

        clima.exibeFicha();
    }
}
