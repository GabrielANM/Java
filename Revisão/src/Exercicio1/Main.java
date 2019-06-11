package Exercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;
        Numero_inteiro divisor = new Numero_inteiro();
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um numero inteiro: ");
        numero = sc.nextInt();

        divisor.numeroAntecessorESucessor(numero);
    }
}
