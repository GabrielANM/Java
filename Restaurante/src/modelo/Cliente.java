package modelo;

public class Cliente {
    private String nome;
    private String Comanda;
    private Integer nota;

    public Cliente(String gabriel_da_galera, modelo.Comanda comanda, int nota) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComanda(int i) {
        return Comanda;
    }

    public void setComanda(String comanda) {
        Comanda = comanda;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Cliente(String nome, String comanda, Integer nota) {
        this.nome = nome;
        Comanda = comanda;
        this.nota = nota;
    }

    public void calcularConta(String nomeDoPrato) {
    }

}
