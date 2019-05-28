import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        double salario, novo_salario;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salario: ");
        salario = sc.nextDouble();
        novo_salario = salario * 1.25;
        System.out.print("O novo valor do salario é: " + novo_salario);
    }
}
