package Exercicio5;

public class Quadrilatero implements FormasGeometricas {

    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Quadrilatero(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calculaAreaDaForma() {
        if (this.base > 0 && this.altura > 0) {
            System.out.println("base: " + this.base + ", altura: " + this.altura + ", a área deste quadrilatero é de: " + this.altura * this.base + " m²");
        } else {
            System.out.println("Impossivel efetuar os calculos com valores negativos ou iguais a 0");
        }
    }

    @Override
    public void calculaPerimetro() {
        if (this.base > 0 && this.altura > 0) {
            System.out.println("base: " + this.base + ", altura: " + this.altura + ", o perimetro deste quadrilatero é de: " + (this.altura * 2 + this.base * 2) + " m");
        } else {
            System.out.println("Impossivel efetuar os calculos com valores negativos ou iguais a 0");
        }
    }
}
