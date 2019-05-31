import java.util.Scanner;
public class exercicios_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, x = 0, valor = 0, y, recebe, imprime;
        int[] primos = new int[9];
        for (y = 0; y < 9; y++) {
            System.out.printf("Digite um numero inteiro maior que zero para o indice " + y + ": ");
            recebe = sc.nextInt();
            primos[y] = recebe;
        }

        for (i = 0; i <= 8; i++) {
            int primo = 0, indice = 0;
            for (x = 2; x < primos[i]; x++) {
                if (primos[i] % x == 0) {
                    primo = x;
                }
                imprime = primos[i];
                indice = i;
                primos[i] = valor;
                if (primo != 0) {
                    System.out.println("O numero do indice " + i + " que tem o valor " + imprime + " não é primo");
                } else {
                    System.out.println("O numero do indice " + i + " que tem o valor " + imprime + " é primo");

                }
            }

        }
    }
}