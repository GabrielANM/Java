import modelo.Cliente;
import modelo.Comanda;
import java.util.HashMap;
import java.util.Map;

public class Restaurante {
        public static void main(String[] args) {
        Comanda comanda = new Comanda( "11/06/2018", "09:20", "Bobó de Camarão");
        Cliente gabriel = new Cliente( "Gabriel da Galera", comanda, 8);



        Map<String, Double> menu = new HashMap<>();
        menu.put("Bobó de Camarão", 44.60);
        menu.put("Ostras Frescas", 34.20);



    }
}
