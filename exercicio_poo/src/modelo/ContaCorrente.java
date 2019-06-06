package modelo;

public class ContaCorrente extends Conta {

    private double chequeEspecial;

    public ContaCorrente(Cliente cliente, double saldo) {
        super(cliente, saldo);
    }

    public ContaCorrente() {
    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
        System.out.println(valor + " " + getSaldo());
    }

    @Override
    public void sacar(double valor) {
        this.setSaldo(this.getSaldo() - valor);
        System.out.println(valor + " " + getSaldo());

    }

    @Override
    public double consultarSaldo() {
        return this.getSaldo();
    }

    public void depositar(Cheque cheque) {
        this.setSaldo(this.getSaldo() + cheque.getValor());
        System.out.println(cheque.getValor() + " " + getSaldo());
    }
}

