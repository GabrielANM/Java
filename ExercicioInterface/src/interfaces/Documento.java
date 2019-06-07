package interfaces;

public class Documento implements Imprimível {
    private String nome;
    private String tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Documento(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Documento() {
    }

    @Override
    public void imprimir() {
        System.out.println("Meu nome é: " + this.nome + " meu tipo é: " + this.tipo + " sou um documento muito legal");
    }
}
