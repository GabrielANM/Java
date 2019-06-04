package modelo;

public class SessaoDeTreinamento {
    private int experiencia;

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public SessaoDeTreinamento(int experiencia) {
        this.experiencia = experiencia;
    }

    public void treinarA(JogadorDeFutebol jogador) {
        System.out.println("Experiência inicial de: " + jogador.getExperiencia());
        jogador.correr();
        jogador.fazerGol();
        jogador.correr();
        jogador.setExperiencia(jogador.getExperiencia() + this.experiencia);
        System.out.println("Experiência final de: " + jogador.getExperiencia());
    }


}
