package modelo;

public class ContaPoupança extends Conta {

    private double taxaJuros;

    public ContaPoupança(Cliente cliente, double saldo) {
        super(cliente, saldo);
    }

    public ContaPoupança() {
    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    @Override
    public void sacar(double valor) {
            this.setSaldo(this.getSaldo() - valor);
    }

    @Override
    public double consultarSaldo() {
        return getSaldo();
    }

    public double recolherJuros() {
        this.taxaJuros = this.getSaldo() * 0.03;
        this.setSaldo(this.getSaldo() - this.taxaJuros);
        return this.getSaldo();
    }

}
