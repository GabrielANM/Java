package Lista2_Exercicio1.modelo.modelo;
import java.util.ArrayList;
import java.util.List;


public class Curso {
    private String nome;
    private Professor professor;
    private  List<Aluno> alunos = new ArrayList<>();
    private List<Aula> aulas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public void adicionarAula(Aula aula) {
        this.aulas.add( aula);
    }

    public void removerAula(Aula aula) {
        this.aulas.remove(aula);
    }

    public Curso(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", professor=" + professor +
                ", alunos=" + alunos +
                ", aulas=" + aulas +
                '}';
    }
}
