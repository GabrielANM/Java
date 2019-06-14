package Lista2_Exercicio1.modelo.modelo;

public class Aluno {
    public Integer ra;
    public String nome;
    public String sobrenome;

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Aluno(Integer ra, String nome, String sobrenome) {
        this.ra = ra;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }

    public void assistirAula(Aula aula) {
        System.out.println("O aluno assistiu a aula de: " + aula.materia.getNome() + " que começou as: " + aula.horarioInicio + " e terminou as: " + aula.horarioFinal);
    }
}
