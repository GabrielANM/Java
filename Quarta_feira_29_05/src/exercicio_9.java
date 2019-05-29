import java.util.Scanner;

public class exercicio_9 {
    public static void main(String[] args) {
        double i, soma = 0, exibir = 0;
        for (i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                soma = i + soma;
                exibir = soma;
                System.out.println(exibir);
            }
        }

    }
}
