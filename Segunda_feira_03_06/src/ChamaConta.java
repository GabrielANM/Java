import modelo.Cliente;
import modelo.Conta;

public class ChamaConta {
    public static void main(String[] args) {
        Cliente gabriel = new Cliente( "Gabriel Alexandre", "Negri Machado");
        Conta conta = new Conta ( 1005, 345.44, gabriel);
        System.out.println("Número da conta: " + conta.getNumeroDaConta() + "\nNome do Cliente: "  + gabriel.getNome() + " " + gabriel.getSobrenome() + "\nSaldo: " + conta.getSaldo() + " R$");

        conta.deposito( 340);
        conta.saque(230);

    }
}
