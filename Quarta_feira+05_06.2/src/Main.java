import interfaces.Cachorro;
import modelos.Gerente;

public class Main {
    public static void main(String[] args) {
        Gerente joao = new Gerente();
        joao.setNome("João Maria");
        System.out.println(joao);

        Gerente maria = new Gerente();
        maria.setNome("João Maria");
        System.out.println(maria);

        /*
        if (joao.equals(maria)) {
            System.out.println("eles são iguais");
        } else {
            System.out.println("eles não são iguais");
        } */

        if (joao.hashCode() == maria.hashCode()) {
            System.out.println("eles são iguais");
        } else {
            System.out.println("eles não são iguais");
        }
    }
}
