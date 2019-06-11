import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import modelo.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setIdade(20);


        try {

            if (pessoa.getIdade() >= 18) {
                System.out.println("Você é maior de idade");
            }
            Integer i = 0;
            if (18/i == 18) {
                System.out.println("entrou");
            }

        } catch (NullPointerException e) {
                e.printStackTrace();
                System.out.println("deu ruim");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Não pode dividir por 0");
        } finally {
            System.out.println("SERA SEMPRE EXECUTADO");
        }

        try {

        } catch (Exception e) {

        }

        System.out.println("continua executando o programa");
    }
}
