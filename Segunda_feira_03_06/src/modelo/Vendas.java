package modelo;

public class Vendas {
    private double valorDaVenda;
    private Veiculo veiculoVendido;
    private Clientes cliente;

    public double getValorDaVenda() {
        return valorDaVenda;
    }

    public void setValorDaVenda(double valorDaVenda) {
        this.valorDaVenda = valorDaVenda;
    }

    public Veiculo getVeiculoVendido() {
        return veiculoVendido;
    }

    public void setVeiculoVendido(Veiculo veiculoVendido) {
        this.veiculoVendido = veiculoVendido;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Vendas(double valorDaVenda, Veiculo veiculoVendido, Clientes cliente) {
        this.valorDaVenda = valorDaVenda;
        this.veiculoVendido = veiculoVendido;
        this.cliente = cliente;
    }
}
