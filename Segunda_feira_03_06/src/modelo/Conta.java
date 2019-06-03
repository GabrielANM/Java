package modelo;

public class Conta {
    private int numeroDaConta;
    private double saldo;
    private Cliente titular;


    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Conta(int numeroDaConta, double saldo, Cliente titular) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void deposito(double quantiaEmDinheiro) {
        this.saldo = this.saldo + quantiaEmDinheiro;
        System.out.println("Seu saldo após o deposito é de: " + this.saldo + "R$");
    }

    public void saque(double quantiaEmDinheiro) {
        this.saldo = this.saldo - quantiaEmDinheiro;
        System.out.println("Seu saldo após o saque é de: " + this.saldo + "R$");
    }

}
