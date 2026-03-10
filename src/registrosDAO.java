import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class registrosDAO {

    public void regsitrarEntrada (String placa) {

        String sql = "INSERT INTO registros ( id_placa, estado) VALUES (?,'dentro') ";


        try {

            Connection conexion = conexionBD.obtenerConexion();
            PreparedStatement statement = conexion.prepareStatement(sql);

            statement.setString(1, placa);
            statement.executeUpdate();

            System.out.println("entrada del vehiculo registrada");

            conexion.close();

        }catch (SQLException e){
            System.out.println("error al registrar entrada" + e.getMessage());

        }
    }

}
