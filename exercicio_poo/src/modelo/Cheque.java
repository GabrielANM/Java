package modelo;

public class Cheque {
    private double valor;
    private String banco;
    private String dataPagamento;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Cheque(double valor, String banco, String dataPagamento) {
        this.valor = valor;
        this.banco = banco;
        this.dataPagamento = dataPagamento;
    }
}
