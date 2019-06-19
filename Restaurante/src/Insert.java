import conection.ConnectionFactory;
import jdk.internal.org.objectweb.asm.tree.analysis.Analyzer;

import java.sql.*;

public class Insert {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement stmt = null;

        try {

            //Se der merda no drive
            //Clas.forName("com.mysql.jdbc.Driver);

            con = new ConnectionFactory().getConnection();

            String sql = "INSERT INTO cliente (id_cliente, nome) VALUES (?, ?)";

            stmt = con.prepareStatement(sql);

            stmt.setInt(1, 4);
            stmt.setString(2, "Carlos");

            stmt.execute();

        } catch (SQLException e) {

            e.printStackTrace();

        } finally {
            try {
                con.close();
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
