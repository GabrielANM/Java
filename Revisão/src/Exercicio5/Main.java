package Exercicio5;

public class Main {
    public static void main(String[] args) {
        Quadrilatero escaleno = new Quadrilatero( 4, 5);
        Circulos circulo = new Circulos( 4);

        escaleno.calculaAreaDaForma();
        escaleno.calculaPerimetro();

        circulo.calculaAreaDaForma();
        circulo.calculaPerimetro();
    }
}
