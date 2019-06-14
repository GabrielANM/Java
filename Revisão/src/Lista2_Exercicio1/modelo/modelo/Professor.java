package Lista2_Exercicio1.modelo.modelo;

import java.util.List;
import java.util.Set;

public class Professor {
    private String nome;
    private Integer rd;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRd() {
        return rd;
    }

    public void setRd(Integer rd) {
        this.rd = rd;
    }

    public Professor(String nome, Integer rd) {
        this.nome = nome;
        this.rd = rd;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", rd=" + rd +
                '}';
    }
    public void darAula(Aula aula) {
        System.out.println("O professor ministrou a aula de: " + aula.materia.getNome() + " que começou as: " + aula.horarioInicio + "e terminou as: " + aula.horarioFinal);
    }

    public void fazerChamada (Set<Aluno> alunos) {
        for(Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
