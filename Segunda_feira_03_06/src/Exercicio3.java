import modelo.Atleta;
import modelo.Prova;

public class Exercicio3 {
    public static void main(String[] args) {
        Atleta castolo = new Atleta("castolo", 25, 4);
        Atleta gabriel = new Atleta("gabriel", 34, 19);

        Prova prova1 = new Prova(15, 5);
        if (prova1.podeFazer(castolo)) {
            System.out.println("O atleta " + castolo.getNome() + " pode realizar a primeira prova");
        } else {
            System.out.println("O atleta " + castolo.getNome() + " não pode realizar a primeira prova");
        }
        if (prova1.podeFazer(gabriel)) {
            System.out.println("O atleta " + gabriel.getNome() + " pode realizar a primeira prova");
        } else {
            System.out.println("O atleta " + gabriel.getNome() + " não pode realizar a primeira prova");
        }

        Prova prova2 = new Prova(7, 5);
        if (prova1.podeFazer(castolo)) {
            System.out.println("\nO atleta " + castolo.getNome() + " pode realizar a segunda prova");
        } else {
            System.out.println("\nO atleta " + castolo.getNome() + " não pode realizar a segunda prova");
        }
        if (prova1.podeFazer(gabriel)) {
            System.out.println("O atleta " + gabriel.getNome() + " pode realizar a segunda prova");
        } else {
            System.out.println("O atleta " + gabriel.getNome() + " não pode realizar a segunda prova");
        }

        Prova prova3 = new Prova(23, 5);
        if (prova1.podeFazer(castolo)) {
            System.out.println("\nO atleta " + castolo.getNome() + " pode realizar a terceira prova");
        } else {
            System.out.println("\nO atleta " + castolo.getNome() + " não pode realizar a terceira prova");
        }
        if (prova1.podeFazer(gabriel)) {
            System.out.println("O atleta " + gabriel.getNome() + " pode realizar a terceira prova");
        } else {
            System.out.println("O atleta " + gabriel.getNome() + " não pode realizar a terceira prova");
        }




    }
}
