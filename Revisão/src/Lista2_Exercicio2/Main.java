package Lista2_Exercicio2;

import Lista2_Exercicio2.modelo.Fatura;

public class Main {
    public static void main(String[] args) {
        Item mouse = new Item( 124, "Mouse para notebook", 2, 42.50);
        Item teclado = new Item ( 687328222, "Teclado funcional ascessivel", 2, 78.99);
        Item mousepad = new Item ( 1856987, "Tapete para mouses", 2, 12.24);
        Item carregador = new Item ( 1908219, "Carregador padrão para notebooks", 2, 43.90);
        Fatura fatura1 = new Fatura();

        fatura1.adicionarItem(mouse);
        fatura1.adicionarItem(teclado);
        fatura1.adicionarItem(mousepad);
        fatura1.adicionarItem(carregador);

        System.out.println(fatura1.getListaDeItems());

        System.out.println("Preço da fatura: " + fatura1.getTotalFatura(fatura1.getListaDeItems()) + " R$");


    }
}
