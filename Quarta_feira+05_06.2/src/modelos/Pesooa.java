package modelos;

import java.util.Objects;

public class Pesooa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pesooa() {

    }

    @Override
    public String toString() {
        return "Pesooa{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Pesooa(String nome) {
        this.nome = nome;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pesooa pesooa = (Pesooa) o;
        return Objects.equals(nome, pesooa.nome);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nome);
    }
}
