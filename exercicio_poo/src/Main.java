import modelo.Cheque;
import modelo.Cliente;
import modelo.ContaCorrente;
import modelo.ContaPoupança;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        Cliente laura = new Cliente( 12345, "Laura da Galera", "46.1234", "3674321-90");
        Cliente gabriel = new Cliente( 14356, "Gabriel da Galera", "39.505.866-1", "470.777.798-82");
        ContaPoupança conta1 = new ContaPoupança( laura, -10234.98);
        ContaCorrente conta2 = new ContaCorrente( gabriel, 645 );
        Cheque cheque1 = new Cheque( 344, "bradesco", "18/06/2019");

        System.out.println("Menu: \n1 - Realizar deposito\n2 - Realizar saque\n3 - Consultar saldo\n0 - Finalizar operação");

        System.out.println();
        conta1.depositar(200);
        conta1.sacar(10000);
        conta1.consultarSaldo();

        System.out.println(conta2.depositar(400));
        conta2.depositar( cheque1);
        conta2.sacar(400);
        conta2.consultarSaldo();



    }
}
