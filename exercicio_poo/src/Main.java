import modelo.Cliente;
import modelo.Conta_poupança;

public class Main {
    public static void main(String[] args) {
        Cliente laura = new Cliente( 12345, "Laura da Galera", "46.1234", "3674321-90");
        Conta_poupança conta1 = new Conta_poupança( laura, -10234.98);

        conta1.depositar(200);
        conta1.sacar(10000);
        conta1.consultarSaldo();

    }
}
