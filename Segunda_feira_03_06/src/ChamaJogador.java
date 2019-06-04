import modelo.JogadorDeFutebol;

public class ChamaJogador {
    public static void main(String[] args) {
        JogadorDeFutebol fulanildo = new JogadorDeFutebol( "Fulanildo", 50, 30, 5, 45);
        System.out.println("Nome do jogador: " + fulanildo.getNome() + "\nEnergia: " + fulanildo.getEnergia() + "\nAlegria: " + fulanildo.getAlegria() + "\nNúmero de gols: " + fulanildo.getGols() + "\nExperiência: " + fulanildo.getExperiencia());

        fulanildo.fazerGol();
        System.out.println("Energia: " + fulanildo.getEnergia() + "\nAlegria: " + fulanildo.getAlegria() + "\nNúmero de gols: " + fulanildo.getGols());

        fulanildo.correr();
        System.out.println("Energia: " + fulanildo.getEnergia());

    }
}
