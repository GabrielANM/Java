public class exercicio_array_1 {
    public static void main(String[] args) {
        int i = 0, x = 0, valor = 0;
        int[] primos = new int[9];
        primos[0] = 76;
        primos[1] = 4;
        primos[2] = 667;
        primos[3] = 45465;
        primos[4] = 3;
        primos[5] = 9;
        primos[6] = 4;
        primos[7] = 65;
        primos[8] = 7112;

        for (i = 0; i <= 8; i++) {
            int primo = 0, indice = 0;
            for (x = 2; x < primos[i]; x++) {
                if (primos[i] % x == 0) {
                    primo = x;
                }
                indice = i;
                primos[i] = valor;
            }
            if (primo != 0) {
                System.out.println("não é primo");
            } else {
                System.out.println("é primo");

            }
        }
    }
}

