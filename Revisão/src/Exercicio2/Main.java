package Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LeitorDeNomes leitor = new LeitorDeNomes();
        Scanner sc = new Scanner(System.in);
        Integer idade1, idade2, idade3;
        String nome1, nome2, nome3;

        System.out.printf("Digite a idade da primeira pessoa: ");
        idade1 = sc.nextInt();
        System.out.printf("Digite o nome da primeira pessoa: ");
        sc.nextLine();
        nome1 = sc.nextLine();

        System.out.printf("\nDigite a idade da segunda pessoa: ");
        idade2 = sc.nextInt();
        System.out.printf("Digite o nome da segunda pessoa: ");
        sc.nextLine();
        nome2 = sc.nextLine();

        System.out.printf("\nDigite a idade da terceira pessoa:");
        idade3 = sc.nextInt();
        System.out.printf("Digite o nome da terceira pessoa: ");
        sc.nextLine();
        nome3 = sc.nextLine();

        leitor.nome(idade1, idade2, idade3, nome1, nome2, nome3);
    }
}
