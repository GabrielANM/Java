import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {
        float nota1, nota2, nota3, media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        nota1 = sc.nextFloat();
        System.out.println("Digite a segunda nota:");
        nota2 = sc.nextFloat();
        System.out.println("Digite a terceira nota:");
        nota3 = sc.nextFloat();
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("O Valor da soma é de: " + media);
    }

}