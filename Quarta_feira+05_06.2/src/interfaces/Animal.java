package interfaces;

public abstract class Animal {
    protected String nome;
    protected Integer idade;
    protected String especie;
    protected char sexo;

    public abstract void respirar();

    public abstract void comer();
}