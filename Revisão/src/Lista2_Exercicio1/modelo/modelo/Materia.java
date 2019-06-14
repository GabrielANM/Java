package Lista2_Exercicio1.modelo.modelo;

public class Materia {
    public String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Materia(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
