package modelo;

public class Animal {
    private String nome;
    private char sexo;
    private String especie;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Animal(String nome, char sexo, String especie, Integer idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.especie = especie;
        this.idade = idade;
    }

    public boolean animalEhMamifero() {
        return false;
    }
}
