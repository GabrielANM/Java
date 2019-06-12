package Exercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LeitorDeNomes leitor = new LeitorDeNomes();
        Scanner sc = new Scanner(System.in);
        Integer idade1, idade2, idade3;
        String nome1, nome2, nome3, maiorIdade = null;

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

        //leitor.nome(idade1, idade2, idade3, nome1, nome2, nome3);

        Map<String, Integer> pessoa = new HashMap<>();
        pessoa.put(nome1, idade1);
        pessoa.put(nome2, idade2);
        pessoa.put(nome3, idade3);

        for (String nome : pessoa.keySet()) {
            int i = 0;
            i = i++;
            if (pessoa.get(i) > pessoa.get(i + 1) && pessoa.get(i) > pessoa.get(i + 2)) {
                maiorIdade = nome;
            }
        }
        System.out.println(maiorIdade);
    }
}
