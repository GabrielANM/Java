import conection.ConnectionFactory;
import dao.ClienteDAO;
import model.Cliente;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RestaurantApplication {

    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setIdCliente(6);
        cliente.setNome("Amanda");

        //clienteDAO.adiciona(diego);
        clienteDAO.altera(cliente);
        System.out.println(clienteDAO.lista());
    }
}
