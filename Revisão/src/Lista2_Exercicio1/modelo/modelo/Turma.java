package Lista2_Exercicio1.modelo.modelo;

public class Turma {
    private String nome;
    private Curso curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Turma(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                ", curso=" + curso +
                '}';
    }
}
