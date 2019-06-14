package Lista2_Exercicio1.modelo.modelo;
import java.util.List;
import java.util.Set;

public class Curso {
    private String nome;
    private Set<Aula> conuntoDeAulas;
    private List<Aluno> listaDeAlunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Aula> getConuntoDeAulas() {
        return conuntoDeAulas;
    }

    public void setConuntoDeAulas(Set<Aula> conuntoDeAulas) {
        this.conuntoDeAulas = conuntoDeAulas;
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public Curso(String nome, Set<Aula> conuntoDeAulas, List<Aluno> listaDeAlunos) {
        this.nome = nome;
        this.conuntoDeAulas = conuntoDeAulas;
        this.listaDeAlunos = listaDeAlunos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", conuntoDeAulas=" + conuntoDeAulas +
                ", listaDeAlunos=" + listaDeAlunos +
                '}';
    }


}
