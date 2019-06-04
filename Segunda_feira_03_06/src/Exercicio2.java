import modelo.JogadorDeFutebol;
import modelo.SessaoDeTreinamento;

public class Exercicio2 {
    public static void main(String[] args) {
        JogadorDeFutebol pele = new JogadorDeFutebol("Pelé", 100, 100, 1000, 100);
        JogadorDeFutebol marta = new JogadorDeFutebol("Marta", 100, 100, 533, 100);

        SessaoDeTreinamento superTreinamento = new SessaoDeTreinamento(1);

        superTreinamento.treinarA(pele);
        superTreinamento.treinarA(marta);

    }
}
