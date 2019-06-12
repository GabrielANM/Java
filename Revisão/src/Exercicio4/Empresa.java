package Exercicio4;

import java.util.List;

public class Empresa {
    private String nome;
    private String cnpj;
    private List<Departamento> departamentos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Departamento> getDepartamentos(Departamento departamento) {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", departamentos=" + departamentos +
                '}';
    }

    public Empresa(String nome, String cnpj, List<Departamento> departamentos) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.departamentos = departamentos;



    }


}
