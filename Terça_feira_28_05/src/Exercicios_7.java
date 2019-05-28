import java.util.Scanner;

public class Exercicios_7 {
        public static void main(String[] args) {
            double salario, novo_salario;
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o valor do salario: ");
            salario = sc.nextDouble();
            novo_salario = (salario * 0.9) + 50;
            System.out.print("O novo valor do salario é de: " + novo_salario);
        }
}




