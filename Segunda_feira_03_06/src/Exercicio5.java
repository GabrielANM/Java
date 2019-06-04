import modelo.*;

public class Exercicio5 {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo( "Ford", "fiesta", 2011, "preto", 20000);
        Clientes virgulino = new Clientes( "Virgulino", "Silveira", "(11)97698-5516");
        Concessionaria concessionaria = new Concessionaria();

        Vendas registroDeVendas1 = concessionaria.registrarVenda( carro, virgulino, 12456.89);
        System.out.println(registroDeVendas1);
    }
}
