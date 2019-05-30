import java.util.Scanner;

public class exemple_for {
    public static void main(String[] args) {
        double entrada;
        int[] lista = new int[9];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            System.out.println("Digite um valor para o indice " + i + ": ");
            lista[i] = sc.nextInt();
        }
        for (int x = 0; x < 9; x++) {
            System.out.println("O valor inserido na posição " + x + " da lista é " + lista[x]);
        }

    }

}
