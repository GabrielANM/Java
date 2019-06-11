package Exercicio4;

public class Funcionario {
    private String nome;
    private Double salario;
    private String dataDeAdmissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(String dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public Funcionario(String nome, Double salario, String dataDeAdmissao) {
        this.nome = nome;
        this.salario = salario;
        this.dataDeAdmissao = dataDeAdmissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", dataDeAdmissao='" + dataDeAdmissao + '\'' +
                '}';
    }

    public void aumentaSalario () {
        double aumento = this.salario * 0.1;
        this.salario += aumento;



    }
}
