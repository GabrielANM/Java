package Lista2_Exercicio3;

import Lista2_Exercicio3.modelo.Estoque;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque( "Estoque São Paulo", 5000, 2000);

        System.out.println(estoque);

        estoque.mudarNome( "Estoque Rua Comendador Ermelindo");
        estoque.mudarQtdMinima( 1000);
        estoque.repor( 500);
        estoque.darBaixa( 4600);
        System.out.println(estoque.mostra());
        System.out.println(estoque.precisaRepor());

        estoque.repor(200);
        System.out.println(estoque.mostra());
        System.out.println(estoque.precisaRepor());
    }
}
