import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        double i, primo = 0, exibir = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro maior que 0: ");
        int numero = sc.nextInt();
        for (i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = i;
            }
        }
        if (primo != 0) {
            System.out.println("não é primo");
        } else {
            System.out.println("é primo");
        }
        }
    }
