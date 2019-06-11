import java.util.ArrayList;
import java.util.List;

public class Exercicio1_Exceptions {

    public static void main(String[] args) {

        List<String> animais = new ArrayList<>();

        animais.add("Pato"); animais.add("Cachorro"); animais.add("Gato");


        try {

            System.out.println(animais.get(3));

        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Você digitou um index que não existe");
        }
    }
}
