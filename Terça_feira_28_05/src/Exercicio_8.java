import java.util.Scanner;

public class Exercicio_8 {
    public static void main (String[] args) {
        double salario, imposto, novo_salario;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do salario: ");
        salario = sc.nextDouble();
        System.out.print("Digite o valor do imposto: ");
        imposto = sc.nextDouble();
        novo_salario = salario * imposto;
        System.out.print("O novo valor do salario é de: " + novo_salario);
    }
}
