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
    public void calculaPerimetro() {
        System.out.println(this.altura * this.base);
    }
}
