package modelo;

public class Prova {
    private int dificuldade;
    private int energiaNecessaria;

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getEnergiaNecessaria() {
        return energiaNecessaria;
    }

    public void setEnergiaNecessaria(int energiaNecessaria) {
        this.energiaNecessaria = energiaNecessaria;
    }

    public Prova(int dificuldade, int energiaNecessaria) {
        this.dificuldade = dificuldade;
        this.energiaNecessaria = energiaNecessaria;
    }

    public boolean podeFazer(Atleta competidor) {
        boolean autorização;
        if ( competidor.getNivel() >= this.dificuldade && competidor.getEnergia() > 0) {
            competidor.setEnergia( competidor.getEnergia() - 5);
            return true;
        } else {
            return false;
        }
    }

}
