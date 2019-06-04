package modelo;

public class Concessionaria {

    public Vendas registrarVenda(Veiculo carros, Clientes comprador, Double valor) {
        return new Vendas( valor, carros, comprador);
    }

}
