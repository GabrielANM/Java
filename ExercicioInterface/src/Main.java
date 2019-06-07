import interfaces.Contrato;
import interfaces.Documento;
import interfaces.Foto;
import interfaces.Impressora;

public class Main {

    public static void main(String[] args) {
        Contrato serviços = new Contrato( "Serviços", "contrato");
        Foto selfie = new Foto( "Selfie", "foto");
        Documento documento = new Documento("Documento", "Word");
        Impressora impressora = new Impressora();

        impressora.adicionarImprimivel( "deu certo");
        impressora.adicionarImprimivel( "deu mesmo");

        impressora.imprimirTudo();


    }
}
