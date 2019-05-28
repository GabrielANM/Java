import java.util.Scanner;

public class Exercicio_3 {
    public static void main (String[] args) {
        double nota1, nota2, nota3, peso1, peso2, peso3, media_ponderada;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota e seu peso: ");
        nota1 = sc.nextDouble();
        peso1 = sc.nextDouble();
        System.out.print("Digite a segunda nota e seu peso: ");
        nota2 = sc.nextDouble();
        peso2 = sc.nextDouble();
        System.out.print("Digite a terceira nota e seu peso: ");
        nota3 = sc.nextDouble();
        peso3 = sc.nextDouble();

        media_ponderada = (nota1 + nota2 + nota3) / (peso1 + peso2 + peso3);
        System.out.println("A média ponderada é de: " + media_ponderada);
    }
}
