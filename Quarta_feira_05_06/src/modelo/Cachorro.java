package modelo;

public class Cachorro extends Animal {
    private boolean pelo;

    public boolean isPelo() {
        return pelo;
    }

    public void setPelo(boolean pelo) {
        this.pelo = pelo;
    }

    public void latir(){
        System.out.println("Au Au!!");
    }

    public Cachorro(String nome, char sexo, String especie, Integer idade, boolean pelo) {
        super(nome, sexo, especie, idade);
        this.pelo = pelo;
    }

    @Override
    public boolean animalEhMamifero() {
        return true;
    }

}
