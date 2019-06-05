package modelo;

public abstract class Conta {
    private Cliente cliente;
    private double saldo;

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
    public abstract void consultarSaldo();

    public Conta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Conta(){
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
