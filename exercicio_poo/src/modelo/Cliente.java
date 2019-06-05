package modelo;

public class Cliente {
    private Integer numero;
    private String nome;
    private String rg;
    private String cpf;


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cliente(Integer numero, String nome, String rg, String cpf) {
        this.numero = numero;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }
}
