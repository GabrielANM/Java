import modelo.Cliente;
import modelo.Conta;

public class Exercicio1 {
    public static void main(String[] args) {
        Cliente fulaninho = new Cliente("Virgulino", "da Silva");
        Cliente ciclaninho = new Cliente("Teobalto", "dos Santos");

        Conta conta1 = new Conta(1232432, 12453, fulaninho);
        Conta conta2 = new Conta(3654761, 3657, ciclaninho);

        System.out.println("Nome do cliente: " + fulaninho.getNome() + " " + fulaninho.getSobrenome() + " \nNumero da conta: " + conta1.getNumeroDaConta() + " \nSaldo: " + conta1.getSaldo());

        conta1.deposito(5000);
        conta1.saque(13000);

        System.out.println("Nome do cliente: " + ciclaninho.getNome() + " " + ciclaninho.getSobrenome() + " \nNumero da conta: " + conta2.getNumeroDaConta() + " \nSaldo: " + conta2.getSaldo());

        conta2.deposito(124);
        conta2.saque(15);
    }

}