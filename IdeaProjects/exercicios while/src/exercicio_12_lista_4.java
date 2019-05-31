import java.util.Scanner;

public class exercicio_12_lista_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, numero, salario_funcionario, pecas = 0, aumento = 0, folha_salarial = 0, pecas_mes = 0;
        double conta_homem = 0, pecas_homem = 0, media_homens = 0, conta_mulher = 0, pecas_mulher = 0, media_mulheres = 0;
        double maior_salario = 0, numero_do_maior_salario = 0,conta_pecas = 0;
        char sexo;
        double[] funcionario = new double[3];
        System.out.printf("Digite o valor do salario minimo: ");
        salario = sc.nextDouble();
        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o numero do funcionário " + i + " : ");
            numero = sc.nextDouble();
            System.out.printf("Digite o sexo do funcionário: " + i + " : ");
            sexo = sc.next().charAt(0);
            System.out.printf("Digite o numero de peças produzidas pelo funcionário neste mês: ");
            pecas = sc.nextDouble();
            if (pecas <= 21) {
                funcionario[i] = salario;
                System.out.printf("O funcionário numero " + numero + " recebeu o salario de " + funcionario[i] + " reais\n");
            } else if (pecas > 21 && pecas <= 31) {
                conta_pecas = pecas - 21;
                aumento = (salario * 0.03) * pecas;
                funcionario[i] = salario + aumento;
                System.out.printf("O funcionário numero " + numero + " recebeu o salario de " + funcionario[i] + " reais\n");
            } else if (pecas > 31) {
                conta_pecas = pecas - 31;
                aumento = (salario * 0.05) * pecas;
                funcionario[i] = salario + aumento;
                System.out.printf("O funcionário numero " + numero + " recebeu o salario de " + funcionario[i] + " reais\n");
            }
        folha_salarial = folha_salarial + funcionario[i];
        pecas_mes = pecas_mes + pecas;
        if (sexo == 'm' ); {
               conta_homem = conta_homem + 1;
               pecas_homem = pecas_homem + pecas;
            }
        if (sexo == 'f' ); {
                conta_mulher = conta_mulher + 1;
                pecas_mulher = pecas_mulher + pecas;
        }
        if (funcionario[i] > maior_salario) {
            maior_salario = funcionario[i];
            numero_do_maior_salario = numero;
        }
        }
        media_homens = pecas_homem / conta_homem;
        media_mulheres = pecas_mulher / conta_mulher;
        System.out.printf("O valor da folha salarial é de: " + folha_salarial + " reais\n");
        System.out.printf("O numero de peças produzidas durante o mês é de: \n" + pecas_mes + "\n");
        System.out.printf("A media de peças produzidas pelos homens neste mês foi de: " + media_homens + "\n");
        System.out.printf("A media de peças produzidas pelas mulheres neste mês foi de: " + media_mulheres + "\n");
        System.out.printf("O funcionario numero " + numero_do_maior_salario + " recebeu o maior salario: " + maior_salario + "\n");
    }
}
