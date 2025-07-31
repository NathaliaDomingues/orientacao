package exercicio.alura;
//1.CLASSE PORTA
public class Porta {
    String cor;
    String material;
    boolean status = true;
    String statusDaPorta;

    public void setStatusDaPorta() {
        if(status == true || statusDaPorta.equals("Fechada")) {
            System.out.println("A porta está aberta");
        } else {
            System.out.println("A porta está fechada");
        }
    }
}
