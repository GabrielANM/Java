import modelo.Cliente;

public class ChamaCliente {
    public static void main(String[] args) {
        Cliente gabriel = new Cliente( "Gabriel Alexandre", "Negri Machado");
        System.out.println("Nome: " + gabriel.getNome() + "\nSobrenome: " + gabriel.getSobrenome());
    }

}
