import java.util.ArrayList;
import java.util.List;

public class Exercicio2_Exceptions {
    public static void main(String[] args) {
        List<String> animais = new ArrayList<>();

        try {
            animais.add("Pato"); animais.add("Cachorro"); animais.add("Gato");
            System.out.println(animais.get(5));

        } catch (NullPointerException e) {

            e.printStackTrace();
            System.out.println("caiu no catch");

        } catch (IndexOutOfBoundsException e) {

            e.printStackTrace();
            System.out.println("Caiu no segundo catch");
        }

        System.out.println("Execução continua");


    }
}
