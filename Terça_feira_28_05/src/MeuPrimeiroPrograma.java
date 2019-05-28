import java.util.Scanner;

public class MeuPrimeiroPrograma {
    public static void main (String[] args) {
        int novo_salario = 0;
        System.out.println("Digite o valor do seu salario: ");
        Scanner entrada = new Scanner(System.in);
        int salario = entrada.nextInt();
        if (salario <= 500) {
            novo_salario = (int) (salario * 1.2);
            System.out.println("O valor do seu novo salario é de: " + novo_salario);
        } else {
            novo_salario = (int) (salario * 1.1);
            System.out.println("O valor do seu novo salario é de: " + novo_salario);
        }
    }
}
