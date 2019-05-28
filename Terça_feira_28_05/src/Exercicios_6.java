import java.util.Scanner;

public class Exercicios_6 {
    public static void main(String[] args) {
        double salario, gratificacao, imposto, novo_salario;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do salario: ");
        salario = sc.nextDouble();
        System.out.print("Digite o valor da gratificação: ");
        gratificacao = sc.nextDouble();
        System.out.print("Digite o valor da imposto: ");
        imposto = sc.nextDouble();
        novo_salario = salario * imposto;
        novo_salario = novo_salario * gratificacao;
        System.out.print("O novo valor do salario é de: " + novo_salario);
    }
}

