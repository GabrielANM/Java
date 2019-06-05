
package modelo;

public class Conta_poupança extends Conta {

    public Conta_poupança(Cliente cliente, double saldo) {
        super(cliente, saldo);
    }

    public Conta_poupança() {
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
    public void consultarSaldo() {
        System.out.println(this.getSaldo());
    }


}
