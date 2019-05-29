public class salario{
    public static void main(String[] args) {
        double percentual = 0.015, novo_salario, i, salario = 1000;
        novo_salario = salario + (salario * percentual);
        for (i = 1997; i <= 2019; i++) {
            percentual =  percentual * 2;
            novo_salario = novo_salario + (novo_salario * percentual);
        }
        System.out.println(novo_salario);
    }
}
