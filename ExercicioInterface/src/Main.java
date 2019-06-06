import interfaces.Contrato;
import interfaces.Foto;

public class Main {

    public static void main(String[] args) {
        Contrato serviços = new Contrato( "Serviços", "contrato");
        Foto selfie = new Foto( "Selfie", "foto");

        serviços.imprimir();
        selfie.imprimir();
    }
}
