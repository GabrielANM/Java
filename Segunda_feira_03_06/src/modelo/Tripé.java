package modelo;

public class Tripé {
    private boolean dobrado;
    private int alturaMaxima;
    private int alturaMinima;
    private int alturaAtual;

    public boolean isDobrado() {
        return dobrado;
    }

    public void setDobrado(boolean dobrado) {
        this.dobrado = dobrado;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(int alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public int getAlturaAtual() {
        return alturaAtual;
    }

    public void setAlturaAtual(int alturaAtual) {
        this.alturaAtual = alturaAtual;
    }

    public Tripé(boolean dobrado, int alturaMaxima, int alturaMinima, int alturaAtual) {
        this.dobrado = dobrado;
        this.alturaMaxima = alturaMaxima;
        this.alturaMinima = alturaMinima;
        this.alturaAtual = alturaAtual;
    }

    public void defineAltura(int novaAltura) {
        this.alturaAtual = novaAltura;
    }

    public void dobrar() {
        if (this.dobrado) {
            this.dobrado = false;
        } else {
            this.dobrado = true;
        }
    }

    public void guardar() {
        this.alturaAtual = this.alturaMinima;
        if (!this.dobrado) {
            this.dobrado = true;
        }
    }

    public boolean prontoParaGuardar() {
        if (this.alturaAtual != this.alturaMinima || !this.dobrado) {
            return false;
        } else {
            return true;
        }
    }

    public void usar(){
        if (this.dobrado) {
            this.dobrado = false;
        }
        if (this.alturaAtual <= (this.alturaMaxima / 2)) {
            this.alturaAtual = this.alturaAtual + (this.alturaMaxima / 2);
        }
    }




}
