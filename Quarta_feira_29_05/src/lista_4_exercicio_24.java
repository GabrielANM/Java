import java.util.Random;
import java.util.Scanner;

public class lista_4_exercicio_24 {
    public static void main(String[] args) {
        int entrada;
        double salario,novo_salario,imposto;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Menu de opções: \n1. Imposto\n2. Novo salário\n3. Classificação\n4. Finalizar o programa\nDigite a opção desejada: ");
            entrada = sc.nextInt();
        } while (entrada != 4);

        if (entrada == 1) {
            System.out.println("Digite o valor do imposto");
            Scanner sc = new Scanner(System.in);
            salario = sc.nextDouble();
            if (salario < 500) {
                imposto = salario * 0.05;
                System.out.printf("O valor do imposto = " + imposto);
            } else if ((salario >= 500) && (salario <=850)) {
                imposto = salario * 0.10;
                System.out.printf("O valor do imposto = " + imposto);
            } else {
                imposto = salario * 0.15;
                System.out.printf("O valor do imposto = " + imposto);
            }
        }
        if (entrada == 2) {
            System.out.println("Digite o valor do salario: ");
            Scanner sc = new Scanner(System.in);
            salario = sc.nextDouble();
        }
    }
    }
