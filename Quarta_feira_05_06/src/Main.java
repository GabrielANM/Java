import modelo.Cachorro;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro( "Laika", 'F', "cachorro", 23, true);
        System.out.println(cachorro.animalEhMamifero());


    }
}
