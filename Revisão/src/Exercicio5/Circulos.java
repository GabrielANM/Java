package Exercicio5;

public class Circulos implements FormasGeometricas {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulos(double raio) {
        this.raio = raio;
    }

    @Override
    public void calculaPerimetro() {
        if (this.raio > 0) {
            System.out.println("O raio deste circulo é: " + this.raio + " m" + ", o perimetro deste circulo é de: " + (3.14 * 2) * this.raio + " m" );
        } else {
            System.out.println("Impossivel realizar o calculo com valor do raio menor ou igual a 0");
        }
    }

    @Override
    public void calculaAreaDaForma() {
        if (this.raio > 0) {
            System.out.println("O raio deste circulo é: " + this.raio + " m" + ", a área deste circulo é de: " + 3.14 * (this.raio * this.raio) + " m²" );
        } else {
            System.out.println("Impossivel realizar o calculo com valor do raio menor ou igual a 0");
        }
    }
}
