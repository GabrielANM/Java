import java.util.Scanner;

public class Exercicios_5 {
    public static void main(String[] args) {
        double salario, percentual, novo_salario;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do salario: ");
        salario = sc.nextDouble();
        System.out.print("Digite o valor do percentual: ");
        percentual = sc.nextDouble();
        novo_salario = salario * percentual;
        System.out.print("O novo valor do salario é de: " + novo_salario);
    }
}
