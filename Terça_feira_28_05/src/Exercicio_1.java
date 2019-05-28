import java.util.Scanner;

public class Exercicio_1 {
    private static int num1, num2, num3, num4, soma;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = sc.nextInt();
        System.out.println("Digite o terceiro numero:");
        num3 = sc.nextInt();
        System.out.println("Digite o quarto numero:");
        num4 = sc.nextInt();

        soma = num1 + num2 + num3 + num4;
        System.out.println("O Valor da soma é de: " + soma);
    }
}
