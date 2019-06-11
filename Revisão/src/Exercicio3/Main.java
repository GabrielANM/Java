package Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumeroDecrescente menor = new NumeroDecrescente();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um numero inteiro: ");
        Integer numero = sc.nextInt();

        menor.decrescente(numero);
    }
}
